import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgxPaginationModule } from 'ngx-pagination';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AladinComponent } from './aladin/aladin.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { MainComponent } from './main/main.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { PlanetDetailComponent } from './planet-detail/planet-detail.component';
import {HttpClientModule} from '@angular/common/http';
import { ChartsComponent } from './charts/charts.component';
import { VirtualskyComponent } from './virtualsky/virtualsky.component';
import { SizeCompareComponent } from './size-compare/size-compare.component';
import {FormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    AppComponent,
    AladinComponent,
    FooterComponent,
    HeaderComponent,
    MainComponent,
    NotFoundComponent,
    PlanetListComponent,
    PlanetDetailComponent,
    ChartsComponent,
    VirtualskyComponent,
    SizeCompareComponent

  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        NgxPaginationModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
