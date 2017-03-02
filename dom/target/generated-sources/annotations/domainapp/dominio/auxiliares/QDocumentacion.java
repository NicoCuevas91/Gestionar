package domainapp.dominio.auxiliares;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDocumentacion extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Documentacion> implements PersistableExpression<Documentacion>
{
    public static final QDocumentacion jdoCandidate = candidate("this");

    public static QDocumentacion candidate(String name)
    {
        return new QDocumentacion(null, name, 5);
    }

    public static QDocumentacion candidate()
    {
        return jdoCandidate;
    }

    public static QDocumentacion parameter(String name)
    {
        return new QDocumentacion(Documentacion.class, name, ExpressionType.PARAMETER);
    }

    public static QDocumentacion variable(String name)
    {
        return new QDocumentacion(Documentacion.class, name, ExpressionType.VARIABLE);
    }

    public final BooleanExpression certificadoMedico;
    public final BooleanExpression hojaPlanilla;

    public QDocumentacion(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.certificadoMedico = new BooleanExpressionImpl(this, "certificadoMedico");
        this.hojaPlanilla = new BooleanExpressionImpl(this, "hojaPlanilla");
    }

    public QDocumentacion(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.certificadoMedico = new BooleanExpressionImpl(this, "certificadoMedico");
        this.hojaPlanilla = new BooleanExpressionImpl(this, "hojaPlanilla");
    }
}
