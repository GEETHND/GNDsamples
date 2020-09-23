import { Component, OnInit } from "@angular/core";
import { RadSideDrawer } from "nativescript-ui-sidedrawer";
import * as app from "tns-core-modules/application";


@Component({
	selector: "Reserve",
	moduleId: module.id,
	templateUrl: "./reserve.component.html",
	//styleUrls: ['./reserve.component.css']
})
export class ReserveComponent implements OnInit {

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