package e5;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import w9.a0;
import w9.b0;
import w9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3286a;

    public /* synthetic */ e(f fVar) {
        this.f3286a = fVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f3286a.f(s4.h.a(exc));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a0 a0Var = (a0) obj;
        d0 d0Var = a0Var.f9802a;
        b0 b0Var = d0Var.f9820b;
        this.f3286a.h(new fd.e(new s4.i("emailLink", b0Var.f9810f, null, b0Var.f9808c, d0Var.h())).c(), a0Var);
    }
}
