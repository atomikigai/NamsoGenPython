package f5;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import r4.i;
import v9.j;
import v9.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements OnFailureListener, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f3606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9.d f3608c;

    public /* synthetic */ f(h hVar, i iVar, v9.d dVar) {
        this.f3606a = hVar;
        this.f3607b = iVar;
        this.f3608c = dVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int iH;
        h hVar = this.f3606a;
        hVar.getClass();
        boolean z4 = exc instanceof j;
        if (exc instanceof v9.h) {
            try {
                iH = u3.b.h(((v9.h) exc).f9247a);
            } catch (IllegalArgumentException unused) {
                iH = 37;
            }
            if (iH == 11) {
                z4 = true;
            }
        }
        if (z4) {
            hVar.f(s4.h.a(new r4.g(12)));
            return;
        }
        if (exc instanceof l) {
            i iVar = this.f3607b;
            String strC = iVar.c();
            if (strC == null) {
                hVar.f(s4.h.a(exc));
            } else {
                com.bumptech.glide.d.l(hVar.i, (s4.c) hVar.f2923f, strC).addOnSuccessListener(new f(hVar, iVar, this.f3608c)).addOnFailureListener(new g(hVar, 0));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        List list = (List) obj;
        h hVar = this.f3606a;
        hVar.getClass();
        i iVar = this.f3607b;
        if (list.contains(iVar.e())) {
            hVar.g(this.f3608c);
        } else if (list.isEmpty()) {
            hVar.f(s4.h.a(new r4.g(3, "No supported providers.")));
        } else {
            hVar.k((String) list.get(0), iVar);
        }
    }
}
