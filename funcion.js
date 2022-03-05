function convertir(){
var valor=parseFloat(document.getElementById("cantidad").value);
var seleccion=document.getElementById("mimoneda");
 var seleccion1=document.getElementById("cambio");
 var de=seleccion.options[seleccion.selectedIndex].value
 var a=seleccion1.options[seleccion1.selectedIndex].value
var dolar=108.18;
var euro=118.18;
var libra=143.07;
var yen=0.94;
var franco=117.73
//peso a dolar
if (de==1 && a==2){
resultado=valor/dolar;
}
//peso a euro
else if(de==1 && a==3){
    resultado=valor/euro;
}
//peso a franco
else if(de==1 && a==4){
    resultado=valor/franco;
}
//peso a libra
else if(de==1 && a==5){
    resultado=valor/libra;
}
//peso a yen
else if(de==1 && a==6){
    resultado=valor/yen;
}
//dolar a peso
else if(de==2 && a==1){
    resultado=valor*dolar;
}
//dolar a euro
else if(de==2 && a==3){
    resultado=valor*(dolar/euro);
}
//dolar a franco
else if(de ==2 && a==4){
    resultado= valor*(dolar/franco);
}
//dolar a libra
else if(de ==2 && a==5){
    resultado= valor*(dolar/libra);
}
//dolar a yen
else if(de==2 && a==6){
    resultado= valor*(dolar/yen);
}
//euro a peso
else if(de ==3 && a==1){
    resultado= valor*euro;
}
//euro a dolar
else if(de ==3 && a==2){
    resultado= valor*(euro/dolar);
}
//euro a franco
else if(de ==3 && a==4){
    resultado= valor*(euro/franco);
}
//euro a libra
else if(de ==3 && a==5){
    resultado= valor*(euro/libra);
}
//euro a yen
else if(de ==3 && a==6){
    resultado= valor*(euro/yen);
}
//franco a peso
else if(de ==4 && a==1){
    resultado= valor*franco;
}
//franco a dolar
else if(de ==4 && a==2){
    resultado= valor*(franco/dolar);
}
//franco a euro
else if(de ==4 && a==3){
    resultado= valor*(franco/euro);
}
//franco a libra
else if(de ==4 && a==5){
    resultado= valor*(franco/libra);
}
//franco a yen
else if(de ==4 && a==6){
    resultado= valor*(franco/yen);
}
//libra a peso
else if(de ==5 && a==1){
    resultado= valor*libra;
}
//libra a dolar
else if(de ==5 && a==2){
    resultado= valor*(libra/dolar);
}
//libra a euro
else if(de ==5 && a==3){
    resultado= valor*(libra/euro);
}
//libra a franco
else if(de ==5 && a==4){
    resultado= valor*(libra/franco);
}
//libra a yen
else if(de ==5 && a==6){
    resultado= valor*(libra/yen);
}
//yen a peso
else if(de ==6 && a==1){
    resultado= valor*yen;
}
//yen a dolar
else if(de ==6 && a==2){
    resultado= valor*(yen/dolar);
}
//yen a euro
else if(de ==6 && a==3){
    resultado= valor*(yen/euro);
}
//yen a franco
else if(de ==6 && a==4){
    resultado= valor*(yen/franco);
}
//yen a libra
else if(de ==6 && a==5){
    resultado= valor*(yen/libra);
}
else{
    resultado=valor;
}
document.getElementById("conversion").value=resultado.toFixed(2);
}
function mostrar(){
    document.getElementById("visual").style.display="block"
}