package b4;

import a4.w;
import a4.x;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import u3.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f1395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f1396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f1397d;

    public d(Context context, x xVar, x xVar2, Class cls) {
        this.f1394a = context.getApplicationContext();
        this.f1395b = xVar;
        this.f1396c = xVar2;
        this.f1397d = cls;
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && a.a.i((Uri) obj);
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, i iVar) {
        Uri uri = (Uri) obj;
        return new w(new o4.d(uri), new c(this.f1394a, this.f1395b, this.f1396c, uri, i, i10, iVar, this.f1397d));
    }
}
