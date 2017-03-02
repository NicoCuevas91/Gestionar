package domainapp.dominio.core;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QSocio extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Socio> implements PersistableExpression<Socio>
{
    public static final QSocio jdoCandidate = candidate("this");

    public static QSocio candidate(String name)
    {
        return new QSocio(null, name, 5);
    }

    public static QSocio candidate()
    {
        return jdoCandidate;
    }

    public static QSocio parameter(String name)
    {
        return new QSocio(Socio.class, name, ExpressionType.PARAMETER);
    }

    public static QSocio variable(String name)
    {
        return new QSocio(Socio.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final StringExpression direccion;
    public final StringExpression DNI;
    public final StringExpression telefono;
    public final StringExpression mail;
    public final BooleanExpression socio;
    public final domainapp.dominio.auxiliares.QCuota cSocial;
    public final domainapp.dominio.auxiliares.QCuota cActividad;
    public final ListExpression hijos;

    public QSocio(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.direccion = new StringExpressionImpl(this, "direccion");
        this.DNI = new StringExpressionImpl(this, "DNI");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.mail = new StringExpressionImpl(this, "mail");
        this.socio = new BooleanExpressionImpl(this, "socio");
        if (depth > 0)
        {
            this.cSocial = new domainapp.dominio.auxiliares.QCuota(this, "cSocial", depth-1);
        }
        else
        {
            this.cSocial = null;
        }
        if (depth > 0)
        {
            this.cActividad = new domainapp.dominio.auxiliares.QCuota(this, "cActividad", depth-1);
        }
        else
        {
            this.cActividad = null;
        }
        this.hijos = new ListExpressionImpl(this, "hijos");
    }

    public QSocio(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.direccion = new StringExpressionImpl(this, "direccion");
        this.DNI = new StringExpressionImpl(this, "DNI");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.mail = new StringExpressionImpl(this, "mail");
        this.socio = new BooleanExpressionImpl(this, "socio");
        this.cSocial = new domainapp.dominio.auxiliares.QCuota(this, "cSocial", 5);
        this.cActividad = new domainapp.dominio.auxiliares.QCuota(this, "cActividad", 5);
        this.hijos = new ListExpressionImpl(this, "hijos");
    }
}
