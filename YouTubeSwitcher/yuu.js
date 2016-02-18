powpow=0;
		function power(){
			var yanai = document.getElementById("yanai");
			var textomatico = document.getElementById("spanner");

			if (powpow==1){
       			yanai.src ="./images/off.png" ;
       			textomatico.innerHTML="";
       			powpow=0;
       		} else {
            powpow++;
       			plus(0);
			}
          count=0;
   		}

		count=0;
   		function plus(x){
   			powpow=1;
			var yanai = document.getElementById("yanai");
			var textomatico = document.getElementById("spanner");
			if (x==33){count++;
			} else if (x==22){count--;
			} else {count=x;
			}

			if (count>12){
				count=1;
			}
			if (count<0){
				count=12;
			}
			
    		switch (count) {
       		case 1:
       			yanai.src = "https://www.youtube.com/embed/QoEeb9HtRlU?autoplay=1" ;
       			textomatico.innerHTML="1 Divine Truth";
       			break;
       		case 2:
       			yanai.src = "https://www.youtube.com/embed/6QVy0nxVg10?autoplay=1" ;
       			textomatico.innerHTML="2 CNN";
       			break;
       		case 3:
       			yanai.src = "https://www.youtube.com/embed/2mJPfVt3HUc?autoplay=1" ;
       			textomatico.innerHTML="3 MTV";
       			break;
      		case 4:
       			yanai.src = "https://www.youtube.com/embed/Uj2JQWhiFS0?autoplay=1" ;
       			textomatico.innerHTML="4 Channel 2";
       			break;
       		case 5:
       			yanai.src = "https://www.youtube.com/embed/v3JDzxamfSg?autoplay=1" ;
       			textomatico.innerHTML="5 Discovery";
       			break;
       		case 6:
       			yanai.src = "https://www.youtube.com/embed/UgiCDDGdnv4?autoplay=1" ;
       			textomatico.innerHTML="6 HBO";
       			break;
      		case 7:
       			yanai.src = "https://www.youtube.com/embed/t0I4mTEdAf8?autoplay=1";
       			textomatico.innerHTML="4 al-Filastin";
       			break;
       		case 8:
       			yanai.src = "https://www.youtube.com/embed/qbhC_rS40O4?autoplay=1" ;
       			textomatico.innerHTML="8 TNT Kids";
       			break;
          case 9:
            yanai.src = "https://www.youtube.com/embed/Eh_aQVsG8t8?autoplay=1" ;
            textomatico.innerHTML="9 ESPN";
            break;
          case 10:
            yanai.src = "https://www.youtube.com/embed/cfXH6AVghks?autoplay=1" ;
            textomatico.innerHTML="10 Fox Sports";
            break;
       		case 11:
       			yanai.src = "https://www.youtube.com/embed/J2uB6ddHiE0?autoplay=1" ;
       			textomatico.innerHTML="11 Jiluhan Int";
       			break;
          case 12:
            yanai.src = "https://www.youtube.com/embed/-UY7pWCQxTY?autoplay=1" ;
            textomatico.innerHTML="12 QVC";
            break;
       		case 0:
       			yanai.src = "https://www.youtube.com/embed/t0I4mTEdAf8?autoplay=1" ;
       			textomatico.innerHTML="AV";
       			break;
   			}
   		}
