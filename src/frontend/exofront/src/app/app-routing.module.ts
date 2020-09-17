import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MainComponent} from './main/main.component';
import {PlanetListComponent} from './planet-list/planet-list.component';
import {PlanetDetailComponent} from './planet-detail/planet-detail.component';
import {NotFoundComponent} from './not-found/not-found.component';
import {ChartsComponent} from './charts/charts.component';



const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot([
    {path: '', component: MainComponent},
    {path: 'home', component: MainComponent},
    {path: 'api/charts', component: ChartsComponent},
    {path: 'api/planets/query/:id', component: PlanetListComponent},
    {path: 'api/planets/query', component: PlanetListComponent},
    {path: 'api/planet/:id', component: PlanetDetailComponent},
    {path: 'api/planets', component: PlanetListComponent},
    {path: '**', component: NotFoundComponent}
    ], { onSameUrlNavigation: 'reload' })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
