import { Component, OnInit } from '@angular/core';
import  *  as $ from  'jquery';

interface AfterViewInit {
}

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit ,AfterViewInit{
  now: Date | undefined;



  constructor() {


  }


  ngOnInit(): void {
    this.now = new Date();

    setInterval(() => {

      this.now = new Date();

    }, 1000);


  }

}
