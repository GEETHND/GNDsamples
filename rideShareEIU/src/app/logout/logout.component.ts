import { Component, OnInit } from "@angular/core";
import { RadSideDrawer } from "nativescript-ui-sidedrawer";
import * as app from "tns-core-modules/application";

@Component({
	selector: "Logout",
	moduleId: module.id,
	templateUrl: "./logout.component.html",
	//styleUrls: ['./login.component.css']
})
export class LogoutComponent implements OnInit {

	constructor() {
	}

	ngOnInit(): void {
	}

	onDrawerButtonTap(): void {
		const sideDrawer = <RadSideDrawer>app.getRootView();
		//console.log(sideDrawer);
		sideDrawer.showDrawer();
	}
}