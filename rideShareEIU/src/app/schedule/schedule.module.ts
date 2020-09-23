import { NgModule, NO_ERRORS_SCHEMA } from "@angular/core";
import { NativeScriptCommonModule } from "nativescript-angular/common";

import { ScheduleRoutingModule } from "./schedule-routing.module";
import { ScheduleComponent } from './schedule.component';

@NgModule({
    imports: [
        NativeScriptCommonModule,
        ScheduleRoutingModule
    ],
    declarations: [
        ScheduleComponent
    ],
    schemas: [
        NO_ERRORS_SCHEMA
    ]
})
export class ScheduleModule { }
