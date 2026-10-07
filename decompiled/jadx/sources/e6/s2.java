package e6;

import android.util.Log;
import app.namso_gen.spacehowen.MainActivity;
import com.google.android.gms.internal.ads.zzblv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends zzblv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2 f3432a;

    public /* synthetic */ s2(t2 t2Var) {
        this.f3432a = t2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzb(List list) {
        int i;
        ArrayList arrayList;
        synchronized (this.f3432a.f3441a) {
            t2 t2Var = this.f3432a;
            t2Var.f3443c = false;
            t2Var.f3444d = true;
            arrayList = new ArrayList(this.f3432a.f3442b);
            this.f3432a.f3442b.clear();
        }
        t2.a(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            MainActivity mainActivity = ((h3.j1) arrayList.get(i)).f4742a;
            int i10 = MainActivity.f1283j0;
            Log.d(mainActivity.W, "MobileAds SDK inicializado");
        }
    }
}
