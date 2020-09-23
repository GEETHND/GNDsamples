import { Component, OnInit } from "@angular/core";
import { RadSideDrawer } from "nativescript-ui-sidedrawer";
import * as app from "tns-core-modules/application";

@Component({
	selector: "Schedule",
	moduleId: module.id,
	templateUrl: "./schedule.component.html",
	//styleUrls: ['./schedule.component.css']
})
export class ScheduleComponent implements OnInit {

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