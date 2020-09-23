import { NgModule, NO_ERRORS_SCHEMA } from "@angular/core";
import { NativeScriptCommonModule } from "nativescript-angular/common";

import { ReserveRoutingModule } from "./reserve-routing.module";
import { ReserveComponent } from './reserve.component';

@NgModule({
    imports: [
        NativeScriptCommonModule,
        ReserveRoutingModule
    ],
    declarations: [
        ReserveComponent
    ],
    schemas: [
        NO_ERRORS_SCHEMA
    ]
})
export class ReserveModule { }
