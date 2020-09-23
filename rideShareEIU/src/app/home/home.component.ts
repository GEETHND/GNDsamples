import { Component, OnInit, ViewChild } from '@angular/core';
import { RadSideDrawer } from "nativescript-ui-sidedrawer";
import * as app from "tns-core-modules/application";
import { registerElement } from 'nativescript-angular/element-registry';
import { MapView, Marker, Position } from 'nativescript-google-maps-sdk';
import { Location, getCurrentLocation, isEnabled, distance, enableLocationRequest, } from "nativescript-geolocation";
import { Accuracy } from "ui/enums";
import * as applicationSettings from "application-settings";
import { Page } from "tns-core-modules/ui/page";


// Important - must register MapView plugin in order to use in Angular templates
registerElement('MapView', () => MapView);

@Component({
    selector: "Home",
    moduleId: module.id,
    templateUrl: "./home.component.html"
})
export class HomeComponent implements OnInit {

    protected map: any;
    latitude = 39.4783;
    longitude = -88.1753;
    zoom = 8;
    bearing = 0;
    tilt = 0;
    padding = [40, 40, 40, 40];
    mapView: MapView;

    lastCamera: String;

    constructor(private page: Page) {
    }

    ngOnInit(): void {
        this.page.actionBarHidden = false;
    }

    onDrawerButtonTap(): void {
        const sideDrawer = <RadSideDrawer>app.getRootView();
        sideDrawer.showDrawer();
    }

    //Map events
    onMapReady(event) {
        var mapView = event.object;
        var gMap = mapView.gMap;

        console.log('Map Ready');
        enableLocationRequest().then(() => {
            getCurrentLocation(
                {
                    desiredAccuracy: Accuracy.high,
                    maximumAge: 5000,
                    timeout: 180000,
                    updateTime: 10000
                }
            ).
                then(location => {
                    console.log("getCurrentLocation called!");
                    //console.log("Location received: " + location);

                    gMap.setMyLocationEnabled(true);


                    console.log("setMyLocationEnabled");


                    /* for android */
                    /*let builder = new mapView.maps.model.LatLngBounds.Builder();
                    let position = new mapView.maps.model.LatLng(location.latitude, location.longitude);
                    builder.include(position);
                    let bounds = builder.build();
                    let padding = 100;
                    let cameraUpdate = mapView.maps.CameraUpdateFactory.newLatLngBounds(bounds, padding);
                    this.mapView.gMap.animateCamera(cameraUpdate);*/

                    this.setMarker(location);

                    //if(mapView.android) {
                    //console.log("gMap.zoom = " + gMap.zoom);
                    //}

                    // if (mapView.ios) {
                    //     gMap.myLocationEnabled = true;
                    //     gMap.settings.myLocationButton = true;
                    // }
                }).catch(error => {
                    console.log("Location error received: " + error);
                    //alert("Location error received: " + error);
                });
        }, (e) => {
            console.log("Error");
            console.log(e);
        })

        this.mapView = event.object;

        console.log("Setting a marker...");
    }

    private setMarker(location): void {
        var marker = new Marker();
        marker.position = Position.positionFromLatLng(location.latitude, location.longitude);
        marker.title = location.title;
        marker.snippet = location.snippet;
        marker.userData = { index: 1 };
        this.mapView.addMarker(marker);
        this.mapView.updateCamera();
    }

    protected mapReady(map) {
        this.map = map;
        console.log("mapReady(map)");
    }

    public markerClicked = (markerObj) => {
        if (this.map)
            this.map.setCenter({ lat: markerObj.latitude, lng: markerObj.longitude });
        console.log('markerClicked', markerObj, { lat: markerObj.latitude, lng: markerObj.longitude });
    }

    onCoordinateTapped(args) {
        console.log("Coordinate Tapped, Lat: " + args.position.latitude + ", Lon: " + args.position.longitude, args);
    }

    onMarkerEvent(args) {
        console.log("Marker Event: '" + args.eventName
            + "' triggered on: " + args.marker.title
            + ", Lat: " + args.marker.position.latitude + ", Lon: " + args.marker.position.longitude, args);
    }

    onCameraChanged(args) {
        console.log("Camera changed: " + JSON.stringify(args.camera), JSON.stringify(args.camera) === this.lastCamera);
        this.lastCamera = JSON.stringify(args.camera);
    }
}
