package b3;

import a2.l;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import c3.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t2.g;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements y2.b, u2.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f1369u = m.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.a f1371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1372c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1373d;
    public final LinkedHashMap e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f1374f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet f1375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y2.c f1376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SystemForegroundService f1377t;

    public c(Context context) {
        j jVarS = j.S(context);
        this.f1370a = jVarS;
        l lVar = jVarS.f8822p;
        this.f1371b = lVar;
        this.f1373d = null;
        this.e = new LinkedHashMap();
        this.f1375r = new HashSet();
        this.f1374f = new HashMap();
        this.f1376s = new y2.c(context, lVar, this);
        jVarS.f8824r.a(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f8544a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f8545b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f8546c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f8544a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f8545b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f8546c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // u2.a
    public final void c(String str, boolean z4) {
        Map.Entry entry;
        synchronized (this.f1372c) {
            try {
                i iVar = (i) this.f1374f.remove(str);
                if (iVar != null ? this.f1375r.remove(iVar) : false) {
                    this.f1376s.b(this.f1375r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.e.remove(str);
        if (str.equals(this.f1373d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f1373d = (String) entry.getKey();
            if (this.f1377t != null) {
                g gVar2 = (g) entry.getValue();
                SystemForegroundService systemForegroundService = this.f1377t;
                systemForegroundService.f1271b.post(new d(systemForegroundService, gVar2.f8544a, gVar2.f8546c, gVar2.f8545b));
                SystemForegroundService systemForegroundService2 = this.f1377t;
                systemForegroundService2.f1271b.post(new androidx.emoji2.text.j(systemForegroundService2, gVar2.f8544a, 1));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f1377t;
        if (gVar == null || systemForegroundService3 == null) {
            return;
        }
        m mVarD = m.d();
        String str2 = f1369u;
        int i = gVar.f8544a;
        int i10 = gVar.f8545b;
        StringBuilder sb2 = new StringBuilder("Removing Notification (id: ");
        sb2.append(i);
        sb2.append(", workSpecId: ");
        sb2.append(str);
        sb2.append(" ,notificationType: ");
        mVarD.a(str2, u3.b.c(sb2, i10, ")"), new Throwable[0]);
        systemForegroundService3.f1271b.post(new androidx.emoji2.text.j(systemForegroundService3, gVar.f8544a, 1));
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m mVarD = m.d();
        StringBuilder sb2 = new StringBuilder("Notifying with (id: ");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType: ");
        mVarD.a(f1369u, u3.b.c(sb2, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f1377t == null) {
            return;
        }
        g gVar = new g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(stringExtra, gVar);
        if (TextUtils.isEmpty(this.f1373d)) {
            this.f1373d = stringExtra;
            SystemForegroundService systemForegroundService = this.f1377t;
            systemForegroundService.f1271b.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f1377t;
        systemForegroundService2.f1271b.post(new androidx.activity.g(systemForegroundService2, intExtra, notification, 2));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((g) ((Map.Entry) it.next()).getValue()).f8545b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f1373d);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f1377t;
            systemForegroundService3.f1271b.post(new d(systemForegroundService3, gVar2.f8544a, gVar2.f8546c, i));
        }
    }

    @Override // y2.b
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            m.d().a(f1369u, u3.b.b("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            j jVar = this.f1370a;
            jVar.f8822p.m(new d3.j(jVar, str, true));
        }
    }

    public final void g() {
        this.f1377t = null;
        synchronized (this.f1372c) {
            this.f1376s.c();
        }
        this.f1370a.f8824r.e(this);
    }

    @Override // y2.b
    public final void f(List list) {
    }
}
