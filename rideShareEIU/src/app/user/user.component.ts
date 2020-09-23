import { Component, OnInit } from "@angular/core";
import { RadSideDrawer } from "nativescript-ui-sidedrawer";
import * as app from "tns-core-modules/application";

@Component({
	selector: "User",
	moduleId: module.id,
	templateUrl: "./user.component.html",
	//styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

	//constructor(private location: Location) {
	constructor() {

	}

	ngOnInit(): void {
	}

	goBack(): void {
	}

	onDrawerButtonTap(): void {
		const sideDrawer = <RadSideDrawer>app.getRootView();
		sideDrawer.showDrawer();
	}

}