package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import jc.i;
import y1.j;
import y1.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1182b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f1183c = new k(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f1184d = new j(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f1184d;
    }
}
