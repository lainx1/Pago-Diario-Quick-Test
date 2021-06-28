# Pago-Diario-Quick-Test
This is a quick test to complete the technical interview for Pago Diario.

En el programa existe la clase Transaction.java.

  La clase transaction tiene los siguientes campos:

	private double amount; (Monto de la transaccion)

	@Json(name = "creation_date")
	private Date creationDate; (Fecha de creacion)
  
	private String operation; (puede set "in" u "out")
	private String status; (puede ser "done", "pending" o "rejected")


Objectivo: Crear una reporte por meses con los siguientes campos sugeridos.

Ingresos pagados y rechazados (La suma de los reportes con status "done" y "rejected" del mes y operation "in").
Egresos pagados y rechazados (La suma de los reportes con status "done" y "rejected" del mes y operation "out").

Ingresos pagados (La suma de los reportes con status "done" del mes y operation "in").
Egresos pagados (La suma de los reportes con status "done" del mes y operation "out").

En el programa existe la clase TransactionRepository.java que tiene el metodo getTransactions(). Este metodo te devuelve todas las transacciones. Que necesitas para trabajar.

Output expected:

    Enero:
    
    Ingresos Pagados y Rechazados : $500.00
    Egresos Pagados y Rechazados : $600.00
    
    Ingresos Pagados: $200.00
    Egresos Pagados: $300.00
   
