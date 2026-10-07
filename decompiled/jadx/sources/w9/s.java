package w9;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f9856c = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f9857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ea.e f9858b;

    public s() {
        n nVar = n.e;
        if (ea.e.f3513d == null) {
            ea.e eVar = new ea.e(6);
            eVar.f3515b = false;
            ea.e.f3513d = eVar;
        }
        ea.e eVar2 = ea.e.f3513d;
        this.f9857a = nVar;
        this.f9858b = eVar2;
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f2045a);
        editorEdit.putString("statusMessage", status.f2046b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth) {
        i0.i(context);
        i0.i(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        n9.g gVar = firebaseAuth.f2698a;
        gVar.a();
        editorEdit.putString("firebaseAppName", gVar.f7360b);
        editorEdit.commit();
    }

    public final void a(androidx.fragment.app.w wVar) {
        n nVar = this.f9857a;
        nVar.getClass();
        n.a(wVar.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        nVar.f9851a = null;
        nVar.f9853c = 0L;
    }
}
