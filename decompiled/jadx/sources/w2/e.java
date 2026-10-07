package w2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c3.i;
import d3.k;
import d3.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements y2.b, u2.a, s {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f9457u = m.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f9461d;
    public final y2.c e;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PowerManager.WakeLock f9464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9465t = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9463r = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9462f = new Object();

    public e(Context context, int i, String str, g gVar) {
        this.f9458a = context;
        this.f9459b = i;
        this.f9461d = gVar;
        this.f9460c = str;
        this.e = new y2.c(context, gVar.f9470b, this);
    }

    public final void a() {
        synchronized (this.f9462f) {
            try {
                this.e.c();
                this.f9461d.f9471c.b(this.f9460c);
                PowerManager.WakeLock wakeLock = this.f9464s;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m.d().a(f9457u, "Releasing wakelock " + this.f9464s + " for WorkSpec " + this.f9460c, new Throwable[0]);
                    this.f9464s.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f9460c;
        sb2.append(str);
        sb2.append(" (");
        sb2.append(this.f9459b);
        sb2.append(")");
        this.f9464s = k.a(this.f9458a, sb2.toString());
        m mVarD = m.d();
        PowerManager.WakeLock wakeLock = this.f9464s;
        String str2 = f9457u;
        mVarD.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f9464s.acquire();
        i iVarL = this.f9461d.e.f8821o.x().l(str);
        if (iVarL == null) {
            d();
            return;
        }
        boolean zB = iVarL.b();
        this.f9465t = zB;
        if (zB) {
            this.e.b(Collections.singletonList(iVarL));
        } else {
            m.d().a(str2, u3.b.b("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // u2.a
    public final void c(String str, boolean z4) {
        m.d().a(f9457u, "onExecuted " + str + ", " + z4, new Throwable[0]);
        a();
        int i = this.f9459b;
        g gVar = this.f9461d;
        Context context = this.f9458a;
        if (z4) {
            gVar.e(new androidx.activity.g(gVar, b.b(context, this.f9460c), i, 6));
        }
        if (this.f9465t) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.e(new androidx.activity.g(gVar, intent, i, 6));
        }
    }

    public final void d() {
        synchronized (this.f9462f) {
            try {
                if (this.f9463r < 2) {
                    this.f9463r = 2;
                    m mVarD = m.d();
                    String str = f9457u;
                    mVarD.a(str, "Stopping work for WorkSpec " + this.f9460c, new Throwable[0]);
                    Context context = this.f9458a;
                    String str2 = this.f9460c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f9461d;
                    gVar.e(new androidx.activity.g(gVar, intent, this.f9459b, 6));
                    if (this.f9461d.f9472d.d(this.f9460c)) {
                        m.d().a(str, "WorkSpec " + this.f9460c + " needs to be rescheduled", new Throwable[0]);
                        Intent intentB = b.b(this.f9458a, this.f9460c);
                        g gVar2 = this.f9461d;
                        gVar2.e(new androidx.activity.g(gVar2, intentB, this.f9459b, 6));
                    } else {
                        m.d().a(str, "Processor does not have WorkSpec " + this.f9460c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    m.d().a(f9457u, "Already stopped work for " + this.f9460c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.b
    public final void e(ArrayList arrayList) {
        d();
    }

    @Override // y2.b
    public final void f(List list) {
        if (list.contains(this.f9460c)) {
            synchronized (this.f9462f) {
                try {
                    if (this.f9463r == 0) {
                        this.f9463r = 1;
                        m.d().a(f9457u, "onAllConstraintsMet for " + this.f9460c, new Throwable[0]);
                        if (this.f9461d.f9472d.g(this.f9460c, null)) {
                            this.f9461d.f9471c.a(this.f9460c, this);
                        } else {
                            a();
                        }
                    } else {
                        m.d().a(f9457u, "Already started work for " + this.f9460c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
