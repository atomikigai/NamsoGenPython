package x2;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import c3.i;
import da.v;
import t2.c;
import t2.d;
import t2.m;
import u.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10256b = m.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f10257a;

    public a(Context context) {
        this.f10257a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public final JobInfo a(i iVar, int i) {
        int i10;
        c cVar = iVar.f1750j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f1744a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f10257a).setRequiresCharging(cVar.f8533b).setRequiresDeviceIdle(cVar.f8534c).setExtras(persistableBundle);
        int i11 = cVar.f8532a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 || i11 != 6) {
            int iD = e.d(i11);
            if (iD == 0) {
                i10 = 0;
            } else if (iD == 1) {
                i10 = 1;
            } else if (iD != 2) {
                i10 = 3;
                if (iD != 3) {
                    i10 = 4;
                    if (iD != 4 || i12 < 26) {
                        m.d().a(f10256b, "API version too low. Cannot convert network type value ".concat(v.w(i11)), new Throwable[0]);
                        i10 = 1;
                    }
                }
            } else {
                i10 = 2;
            }
            extras.setRequiredNetworkType(i10);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f8534c) {
            extras.setBackoffCriteria(iVar.f1753m, iVar.f1752l == 2 ? 0 : 1);
        }
        long jMax = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!iVar.f1757q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.h.f8540a.size() > 0) {
            for (d dVar : cVar.h.f8540a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f8538a, dVar.f8539b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f8536f);
            extras.setTriggerContentMaxDelay(cVar.f8537g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f8535d);
            extras.setRequiresStorageNotLow(cVar.e);
        }
        boolean z4 = iVar.f1751k > 0;
        if (m0.b.b() && iVar.f1757q && !z4) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
