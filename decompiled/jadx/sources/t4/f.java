package t4;

import androidx.lifecycle.z;
import com.google.android.gms.tasks.OnFailureListener;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements OnFailureListener, x9.e, b5.c, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8598a;

    public /* synthetic */ f(Object obj) {
        this.f8598a = obj;
    }

    @Override // x9.e
    public Object d(s sVar) {
        return this.f8598a;
    }

    @Override // b5.c
    public void k() {
        ((y4.b) this.f8598a).b0();
    }

    @Override // androidx.lifecycle.z
    public void m(Object obj) {
        y4.g gVar = (y4.g) this.f8598a;
        if (((s4.h) obj).f8417a == 2) {
            gVar.f10580o0.setText("");
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((g) this.f8598a).f(s4.h.a(exc));
    }
}
