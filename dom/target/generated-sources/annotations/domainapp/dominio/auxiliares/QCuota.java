package domainapp.dominio.auxiliares;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCuota extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Cuota> implements PersistableExpression<Cuota>
{
    public static final QCuota jdoCandidate = candidate("this");

    public static QCuota candidate(String name)
    {
        return new QCuota(null, name, 5);
    }

    public static QCuota candidate()
    {
        return jdoCandidate;
    }

    public static QCuota parameter(String name)
    {
        return new QCuota(Cuota.class, name, ExpressionType.PARAMETER);
    }

    public static QCuota variable(String name)
    {
        return new QCuota(Cuota.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Double> enero;
    public final NumericExpression<Double> febrero;
    public final NumericExpression<Double> marzo;
    public final NumericExpression<Double> abril;
    public final NumericExpression<Double> mayo;
    public final NumericExpression<Double> junio;
    public final NumericExpression<Double> julio;
    public final NumericExpression<Double> agosto;
    public final NumericExpression<Double> septiembre;
    public final NumericExpression<Double> octubre;
    public final NumericExpression<Double> noviembre;
    public final NumericExpression<Double> diciembre;

    public QCuota(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.enero = new NumericExpressionImpl<Double>(this, "enero");
        this.febrero = new NumericExpressionImpl<Double>(this, "febrero");
        this.marzo = new NumericExpressionImpl<Double>(this, "marzo");
        this.abril = new NumericExpressionImpl<Double>(this, "abril");
        this.mayo = new NumericExpressionImpl<Double>(this, "mayo");
        this.junio = new NumericExpressionImpl<Double>(this, "junio");
        this.julio = new NumericExpressionImpl<Double>(this, "julio");
        this.agosto = new NumericExpressionImpl<Double>(this, "agosto");
        this.septiembre = new NumericExpressionImpl<Double>(this, "septiembre");
        this.octubre = new NumericExpressionImpl<Double>(this, "octubre");
        this.noviembre = new NumericExpressionImpl<Double>(this, "noviembre");
        this.diciembre = new NumericExpressionImpl<Double>(this, "diciembre");
    }

    public QCuota(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.enero = new NumericExpressionImpl<Double>(this, "enero");
        this.febrero = new NumericExpressionImpl<Double>(this, "febrero");
        this.marzo = new NumericExpressionImpl<Double>(this, "marzo");
        this.abril = new NumericExpressionImpl<Double>(this, "abril");
        this.mayo = new NumericExpressionImpl<Double>(this, "mayo");
        this.junio = new NumericExpressionImpl<Double>(this, "junio");
        this.julio = new NumericExpressionImpl<Double>(this, "julio");
        this.agosto = new NumericExpressionImpl<Double>(this, "agosto");
        this.septiembre = new NumericExpressionImpl<Double>(this, "septiembre");
        this.octubre = new NumericExpressionImpl<Double>(this, "octubre");
        this.noviembre = new NumericExpressionImpl<Double>(this, "noviembre");
        this.diciembre = new NumericExpressionImpl<Double>(this, "diciembre");
    }
}
