package h3;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.data.NotesDatabase;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f4630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4631d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(e1 e1Var, Object obj, int i, yb.d dVar, int i10) {
        super(2, dVar);
        this.f4628a = i10;
        this.f4630c = e1Var;
        this.e = obj;
        this.f4631d = i;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4628a) {
            case 0:
                return new b1(this.f4630c, (String) this.e, this.f4631d, dVar, 0);
            default:
                return new b1(this.f4630c, (Purchase) this.e, this.f4631d, dVar, 1);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4628a) {
            case 0:
                break;
        }
        return ((b1) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Context contextR;
        switch (this.f4628a) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i = this.f4629b;
                e1 e1Var = this.f4630c;
                try {
                    if (i == 0) {
                        r7.g.G(obj);
                        i3.e eVarS = NotesDatabase.f1305l.a(e1Var.U()).s();
                        i3.a aVar2 = new i3.a(this.f4631d, 0L, System.currentTimeMillis(), e1Var.f4676q0, (String) this.e);
                        this.f4629b = 1;
                        if (n9.b.w(new i3.b(eVarS, aVar2, 1), eVarS.f5167a, this, false, true) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r7.g.G(obj);
                    }
                    Log.d("Historial", "Lote guardado (" + e1Var.f4676q0 + "): " + this.f4631d + " tarjetas");
                    break;
                } catch (Exception e) {
                    Log.e("Historial", "Error guardando lote en historial: " + e.getMessage());
                }
                return ub.k.f9073a;
            default:
                zb.a aVar3 = zb.a.f11555a;
                int i10 = this.f4629b;
                e1 e1Var2 = this.f4630c;
                if (i10 == 0) {
                    r7.g.G(obj);
                    Purchase purchase = (Purchase) this.e;
                    this.f4629b = 1;
                    obj = e1.b0(e1Var2, purchase, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                if (((Integer) obj) != null && (contextR = e1Var2.r()) != null) {
                    Toast.makeText(contextR, e1Var2.w(R.string.purchase_success_coins, new Integer(this.f4631d * 100)), 0).show();
                }
                return ub.k.f9073a;
        }
    }
}
