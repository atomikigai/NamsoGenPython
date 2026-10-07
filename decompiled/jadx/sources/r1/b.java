package r1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final a a(Context context) {
        i.e(context, "context");
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        p1.a aVar = p1.a.f7786a;
        sb2.append(i >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb2.toString());
        t1.b bVar = (i >= 30 ? aVar.a() : 0) >= 5 ? new t1.b(context) : null;
        if (bVar != null) {
            return new a(bVar);
        }
        return null;
    }

    public abstract m9.a b(Uri uri, InputEvent inputEvent);
}
