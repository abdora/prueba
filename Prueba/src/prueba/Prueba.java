package prueba;



import java.text.DateFormat;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.util.GregorianCalendar;


public class Prueba {


//Metodo usado para obtener la fecha actual

//@return Retorna un <b>STRING</b> con la fecha actual formato "dd-MM-yyyy"

public static String getFechaActual() {

java.util.Date ahora = new java.util.Date();

SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
//segunda rama


return formateador.format(ahora);


}


//Metodo usado para obtener la hora actual del sistema

//@return Retorna un <b>STRING</b> con la hora actual formato "hh:mm:ss"

public static String getHoraActual() {

java.util.Date ahora = new java.util.Date();

SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");

return formateador.format(ahora);

}


//Sumarle dias a una fecha determinada

//@param fch La fecha para sumarle los dias

//@param Numero de dias a agregar

//@return La fecha agregando los dias

public static java.util.Date sumarFechaDias(java.util.Date fch, int dias) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.DATE, dias);

return new java.util.Date(cal.getTimeInMillis());

}


//Restarle dias a una fecha determinada

//@param fch La fecha

//@param Dias a restar

//@return La fecha restando los dias

public static synchronized java.util.Date restarFechaDias(java.util.Date fch, int dias) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.DATE, -dias);

return new java.util.Date(cal.getTimeInMillis());

}


//Sumarle horas a una fecha determinada

//@param fch La fecha para sumarle las horas

//@param Numero de horas a agregar

//@return La fecha agregando las horas

public static java.util.Date sumarFechaHoras(java.util.Date fch, int horas) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.HOUR, horas);

return new java.util.Date(cal.getTimeInMillis());

}


//Restarle horas a una fecha determinada

//@param fch La fecha para restarle las horas

//@param Numero de horas a restar

//@return La fecha restando las horas

public static java.util.Date restarFechaHoras(java.util.Date fch, int horas) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.HOUR, -horas);

return new java.util.Date(cal.getTimeInMillis());

}


//Sumarle meses a una fecha determinada

//@param fch La fecha para sumarle los meses

//@param Numero de meses a agregar

//@return La fecha agregando los meses

public static java.util.Date sumarFechaMeses(java.util.Date fch, int meses) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.MONTH, meses);

return new java.util.Date(cal.getTimeInMillis());

}


//Restarle meses a una fecha determinada

//@param fch La fecha para restarle los meses

//@param Numero de meses a restar

//@return La fecha restando los meses

public static java.util.Date restarFechaMeses(java.util.Date fch, int meses) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.MONTH, -meses);

return new java.util.Date(cal.getTimeInMillis());

}


//Sumarle minutos a una fecha determinada

//@param fch La fecha para sumarle los minutos

//@param Numero de minutos a agregar

//@return La fecha agregando los minutos

public static java.util.Date sumarFechaMinutos(java.util.Date fch, int minutos) {

Calendar cal = Calendar.getInstance();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.MINUTE, minutos);

return new java.util.Date(cal.getTimeInMillis());

}


//Restarle minutos a una fecha determinada

//@param fch La fecha

//@param minutos a restar

//@return La fecha restando los minutos

public static synchronized java.util.Date restarFechaMinutos(java.util.Date fch, int minutos) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.MINUTE, -minutos);

return new java.util.Date(cal.getTimeInMillis());

}


//Sumarle segundos a una fecha determinada

//@param fch La fecha para sumarle los segundos

//@param Numero de segundos a agregar

//@return La fecha agregando los segundos

public static java.util.Date sumarFechaSegundos(java.util.Date fch, int segundos) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.SECOND, segundos);

return new java.util.Date(cal.getTimeInMillis());

}


//Restarle segundos a una fecha determinada

//@param fch La fecha

//@param segundos a restar

//@return La fecha restando los segundos

public static synchronized java.util.Date restarFechaSegundos(java.util.Date fch, int segundos) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.SECOND, -segundos);

return new java.util.Date(cal.getTimeInMillis());

}


//Sumarle dias, minutos y segundos a una fecha determinada

//@param fch La fecha para sumarle 

//@param Numero de horas a agregar

//@param Numero de minutos a agregar

//@param Numero de segundos a agregar

//@return La fecha agregando las horas, minutos y segundos

public static java.util.Date sumarFechaHoraMinSeg(java.util.Date fch, int meses, int horas, int minutos, int segundos) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.MONTH, meses);

cal.add(Calendar.HOUR, horas);

cal.add(Calendar.MINUTE, minutos);

cal.add(Calendar.SECOND, segundos);

return new java.util.Date(cal.getTimeInMillis());

}


//Restarle dias, minutos y segundos a una fecha determinada

//@param fch La fecha para restarle 

//@param Numero de horas a restar

//@param Numero de minutos a restar

//@param Numero de segundos a restar

//@return La fecha restando las horas, minutos y segundos

public static java.util.Date restarFechaHoraMinSeg(java.util.Date fch,int meses, int horas, int minutos, int segundos) {

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fch.getTime());

cal.add(Calendar.MONTH, -meses);

cal.add(Calendar.HOUR, -horas);

cal.add(Calendar.MINUTE, -minutos);

cal.add(Calendar.SECOND, -segundos);

return new java.util.Date(cal.getTimeInMillis());

}


//Pasa una fecha de java.util.Date a java.sql.Date

//@param fecha La fecha

//@return La fecha en java.sql.Date

public static java.sql.Date fromUtilDateToSqlDate(java.util.Date fecha){

Calendar cal = new GregorianCalendar();

cal.setTimeInMillis(fecha.getTime());

return new java.sql.Date(cal.getTimeInMillis());


}


//Diferencias entre dos fechas

//@param fechaInicial La fecha de inicio

//@param fechaFinal La fecha de fin

//@return Retorna el numero de dias entre dos fechas

public static synchronized int diferenciaDeFechas(java.util.Date fechaInicial, java.util.Date fechaFinal) {


DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);

String fechaInicioString = df.format(fechaInicial);

try {

fechaInicial = df.parse(fechaInicioString);

} catch (ParseException ex) {

}


String fechaFinalString = df.format(fechaFinal);

try {

fechaFinal = df.parse(fechaFinalString);

} catch (ParseException ex) {

}


long fechaInicialMs = fechaInicial.getTime();

long fechaFinalMs = fechaFinal.getTime();

long diferencia = fechaFinalMs - fechaInicialMs;

double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));

return ((int) dias);

}


//Devuele un java.util.Date desde un String en formato dd-MM-yyyy

//@param La fecha a convertir a formato date

//@return Retorna la fecha en formato Date

public static synchronized java.util.Date fromStringToDate(String fecha, String separador) {

SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd"+separador+"MM"+separador+"yyyy");

java.util.Date fechaEnviar = null;

try {

fechaEnviar = formatoDelTexto.parse(fecha);

return fechaEnviar;

} catch (ParseException ex) {

ex.printStackTrace();

return null;

}

}


//Devuele un java.util.Date desde un String en formato dd-MM-yyyy HH:mm:ss

//@param La fecha a convertir a formato date

//@return Retorna la fecha en formato Date

public static synchronized java.util.Date fromStringFechaHoraToDate(String fecha, String separador) {

SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd"+separador+"MM"+separador+"yyyy HH:mm:ss");

java.util.Date fechaEnviar = null;

try {

fechaEnviar = formatoDelTexto.parse(fecha);

return fechaEnviar;

} catch (ParseException ex) {

ex.printStackTrace();

return null;

}

}


//Devuele String desde un java.util.Date en el formato que quieras por ejemplo "dd/MM/yyyy HH:mm:ss"

//@param La fecha a convertir a formato String

//@param Separador de dígitos de la fecha

//@return Retorna la fecha en formato String

public static synchronized String fromDateToFechaConFormatoString(java.util.Date fecha, String formato) {

SimpleDateFormat sdf=new SimpleDateFormat(formato); 

return sdf.format(fecha);

}


//Devuele String desde un java.util.Date en formato dd*MM*yyyy HH:mm:ss

//@param La fecha a convertir a formato String

//@param Separador de dígitos de la fecha

//@return Retorna la fecha en formato String

public static synchronized String fromDateToFechaHoraString(java.util.Date fecha, String separador) {

SimpleDateFormat sdf=new SimpleDateFormat("dd"+separador+"MM"+separador+"yyyy HH:mm:ss"); 

return sdf.format(fecha);

}


//Devuele String desde un java.util.Date en formato dd*MM*yyyy

//@param La fecha a convertir a formato String

//@param Separador de dígitos de la fecha

//@return Retorna la fecha en formato String

public static synchronized String fromDateToFechaString(java.util.Date fecha, String separador) {

SimpleDateFormat sdf=new SimpleDateFormat("dd"+separador+"MM"+separador+"yyyy"); 

return sdf.format(fecha);

}


//Devuele String desde un java.util.Date en formato HH:mm:ss

//@param La fecha a convertir a formato String

//@return Retorna la hora en formato String

public static synchronized String fromDateToHoraString(java.util.Date fecha) {

SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss"); 

return sdf.format(fecha);

}


/**

* Devuelve la diferencia entre fecha1 y fecha2 dependiendo del parametro tipo

* @param fecha1

* @param fecha2

* @param tipo. La respuesta en milisegundos por defecto a no ser que en tipo metamos 1=segundos, 2=minutos, 3=horas, 4=dias

* @return

*/

public static long diferenciaEntreFechas(java.util.Date fecha1, java.util.Date fecha2, int tipo){


Calendar cal1 = Calendar.getInstance();

Calendar cal2 = Calendar.getInstance();


//Establecer las fechas

cal1.setTime(fecha1);

cal2.setTime(fecha2);


//conseguir la representacion de la fecha en milisegundos

long milis1 = cal1.getTimeInMillis();

long milis2 = cal2.getTimeInMillis();


//calcular la diferencia en milisengundos


long diff = milis1-milis2;


switch (tipo) {

case 1:// calcular la diferencia en segundos

diff=diff / 1000;

break;

case 2:// calcular la diferencia en minutos

diff=diff / (60 * 1000);

break;

case 3:// calcular la diferencia en horas

diff=diff / (60 * 60 * 1000);

break;

case 4:// calcular la diferencia en dias

diff=diff / (24 * 60 * 60 * 1000);

break;

}


return diff;


}


public static void main(String[] args) {


Calendar cal=Calendar.getInstance();

cal.set(2012, 2, 25, 1, 59, 0);

Date fecha1=cal.getTime();









Date fechaPru=Prueba.sumarFechaMinutos(fecha1, 1);


System.out.println(fechaPru.toString());



}


}
