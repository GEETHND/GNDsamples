import { NgModule } from "@angular/core";
import { Routes } from "@angular/router";
import { NativeScriptRouterModule } from "nativescript-angular/router";

const routes: Routes = [
    { path: "", redirectTo: "/home", pathMatch: "full" },
    { path: "home", loadChildren: "~/app/home/home.module#HomeModule" },
    { path: "reserve", loadChildren: "~/app/reserve/reserve.module#ReserveModule" },
    { path: "schedule", loadChildren: "~/app/schedule/schedule.module#ScheduleModule" },
    { path: "user", loadChildren: "~/app/user/user.module#UserModule" },
    { path: "logout", loadChildren: "~/app/logout/logout.module#LogoutModule" },
];

@NgModule({
    imports: [NativeScriptRouterModule.forRoot(routes)],
    exports: [NativeScriptRouterModule]
})
export class AppRoutingModule { }
