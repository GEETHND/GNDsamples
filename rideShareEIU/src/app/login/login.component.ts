import { Component, OnInit } from "@angular/core";
import { getRootView } from "tns-core-modules/application";
import { RadSideDrawer } from "nativescript-ui-sidedrawer";

@Component({
	selector: "Login",
	moduleId: module.id,
	templateUrl: "./login.component.html",
	//styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	constructor() {
	}

	ngOnInit(): void {
	}

	onDrawerButtonTap(): void {
		const sideDrawer = <RadSideDrawer>getRootView();
		sideDrawer.showDrawer();
	}
}