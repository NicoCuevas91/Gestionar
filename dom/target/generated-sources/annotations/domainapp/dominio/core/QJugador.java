package domainapp.dominio.core;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QJugador extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Jugador> implements PersistableExpression<Jugador>
{
    public static final QJugador jdoCandidate = candidate("this");

    public static QJugador candidate(String name)
    {
        return new QJugador(null, name, 5);
    }

    public static QJugador candidate()
    {
        return jdoCandidate;
    }

    public static QJugador parameter(String name)
    {
        return new QJugador(Jugador.class, name, ExpressionType.PARAMETER);
    }

    public static QJugador variable(String name)
    {
        return new QJugador(Jugador.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final StringExpression DNI;
    public final StringExpression telefono;
    public final DateTimeExpression fechaNacimiento;
    public final StringExpression escuela;
    public final StringExpression lugarNacimiento;
    public final StringExpression obraSocial;
    public final NumericExpression<Double> peso;
    public final NumericExpression<Double> altura;
    public final BooleanExpression medicamentos;
    public final StringExpression rMedicamentos;
    public final BooleanExpression alergia;
    public final StringExpression rAlergia;
    public final ObjectExpression<domainapp.dominio.auxiliares.Categoria> categoria;
    public final domainapp.dominio.auxiliares.QDocumentacion documentacion;
    public final ObjectExpression<domainapp.dominio.auxiliares.Disciplina> disciplina;
    public final StringExpression observaciones;
    public final domainapp.dominio.core.QSocio madre;
    public final domainapp.dominio.core.QSocio padre;
    public final domainapp.dominio.auxiliares.QCuota cuotas;

    public QJugador(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.DNI = new StringExpressionImpl(this, "DNI");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.fechaNacimiento = new DateTimeExpressionImpl(this, "fechaNacimiento");
        this.escuela = new StringExpressionImpl(this, "escuela");
        this.lugarNacimiento = new StringExpressionImpl(this, "lugarNacimiento");
        this.obraSocial = new StringExpressionImpl(this, "obraSocial");
        this.peso = new NumericExpressionImpl<Double>(this, "peso");
        this.altura = new NumericExpressionImpl<Double>(this, "altura");
        this.medicamentos = new BooleanExpressionImpl(this, "medicamentos");
        this.rMedicamentos = new StringExpressionImpl(this, "rMedicamentos");
        this.alergia = new BooleanExpressionImpl(this, "alergia");
        this.rAlergia = new StringExpressionImpl(this, "rAlergia");
        this.categoria = new ObjectExpressionImpl<domainapp.dominio.auxiliares.Categoria>(this, "categoria");
        if (depth > 0)
        {
            this.documentacion = new domainapp.dominio.auxiliares.QDocumentacion(this, "documentacion", depth-1);
        }
        else
        {
            this.documentacion = null;
        }
        this.disciplina = new ObjectExpressionImpl<domainapp.dominio.auxiliares.Disciplina>(this, "disciplina");
        this.observaciones = new StringExpressionImpl(this, "observaciones");
        if (depth > 0)
        {
            this.madre = new domainapp.dominio.core.QSocio(this, "madre", depth-1);
        }
        else
        {
            this.madre = null;
        }
        if (depth > 0)
        {
            this.padre = new domainapp.dominio.core.QSocio(this, "padre", depth-1);
        }
        else
        {
            this.padre = null;
        }
        if (depth > 0)
        {
            this.cuotas = new domainapp.dominio.auxiliares.QCuota(this, "cuotas", depth-1);
        }
        else
        {
            this.cuotas = null;
        }
    }

    public QJugador(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.DNI = new StringExpressionImpl(this, "DNI");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.fechaNacimiento = new DateTimeExpressionImpl(this, "fechaNacimiento");
        this.escuela = new StringExpressionImpl(this, "escuela");
        this.lugarNacimiento = new StringExpressionImpl(this, "lugarNacimiento");
        this.obraSocial = new StringExpressionImpl(this, "obraSocial");
        this.peso = new NumericExpressionImpl<Double>(this, "peso");
        this.altura = new NumericExpressionImpl<Double>(this, "altura");
        this.medicamentos = new BooleanExpressionImpl(this, "medicamentos");
        this.rMedicamentos = new StringExpressionImpl(this, "rMedicamentos");
        this.alergia = new BooleanExpressionImpl(this, "alergia");
        this.rAlergia = new StringExpressionImpl(this, "rAlergia");
        this.categoria = new ObjectExpressionImpl<domainapp.dominio.auxiliares.Categoria>(this, "categoria");
        this.documentacion = new domainapp.dominio.auxiliares.QDocumentacion(this, "documentacion", 5);
        this.disciplina = new ObjectExpressionImpl<domainapp.dominio.auxiliares.Disciplina>(this, "disciplina");
        this.observaciones = new StringExpressionImpl(this, "observaciones");
        this.madre = new domainapp.dominio.core.QSocio(this, "madre", 5);
        this.padre = new domainapp.dominio.core.QSocio(this, "padre", 5);
        this.cuotas = new domainapp.dominio.auxiliares.QCuota(this, "cuotas", 5);
    }
}
