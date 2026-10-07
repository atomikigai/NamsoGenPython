package w2;

import a2.l;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d3.i;
import d3.k;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9467b;

    public /* synthetic */ f(g gVar, int i) {
        this.f9466a = i;
        this.f9467b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005e, B:20:0x0068, B:22:0x0070, B:23:0x0072, B:27:0x007c, B:29:0x008b, B:37:0x009d, B:33:0x0091, B:34:0x0092, B:36:0x009a, B:41:0x00a1, B:24:0x0073, B:25:0x0079, B:17:0x005f, B:18:0x0065), top: B:66:0x001b, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005e, B:20:0x0068, B:22:0x0070, B:23:0x0072, B:27:0x007c, B:29:0x008b, B:37:0x009d, B:33:0x0091, B:34:0x0092, B:36:0x009a, B:41:0x00a1, B:24:0x0073, B:25:0x0079, B:17:0x005f, B:18:0x0065), top: B:66:0x001b, inners: #4, #5 }] */
    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        f fVar;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f9466a) {
            case 0:
                synchronized (this.f9467b.f9475s) {
                    g gVar2 = this.f9467b;
                    gVar2.f9476t = (Intent) gVar2.f9475s.get(0);
                    break;
                }
                Intent intent = this.f9467b.f9476t;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f9467b.f9476t.getIntExtra("KEY_START_ID", 0);
                    m mVarD = m.d();
                    String str = g.f9468v;
                    mVarD.a(str, String.format("Processing command %s, %s", this.f9467b.f9476t, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock wakeLockA = k.a(this.f9467b.f9469a, action + " (" + intExtra + ")");
                    try {
                        m.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.acquire();
                        g gVar3 = this.f9467b;
                        gVar3.f9473f.d(gVar3.f9476t, intExtra, gVar3);
                        m.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.release();
                        gVar = this.f9467b;
                        fVar = new f(gVar, 1);
                    } catch (Throwable th) {
                        try {
                            m mVarD2 = m.d();
                            String str2 = g.f9468v;
                            mVarD2.b(str2, "Unexpected error in onHandleIntent", th);
                            m.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            gVar = this.f9467b;
                            fVar = new f(gVar, 1);
                        } catch (Throwable th2) {
                            m.d().a(g.f9468v, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            g gVar4 = this.f9467b;
                            gVar4.e(new f(gVar4, 1));
                            throw th2;
                        }
                    }
                    gVar.e(fVar);
                    return;
                }
                return;
            default:
                g gVar5 = this.f9467b;
                m mVarD3 = m.d();
                String str3 = g.f9468v;
                mVarD3.a(str3, "Checking if commands are complete.", new Throwable[0]);
                gVar5.b();
                synchronized (gVar5.f9475s) {
                    try {
                        if (gVar5.f9476t != null) {
                            m.d().a(str3, String.format("Removing command %s", gVar5.f9476t), new Throwable[0]);
                            if (!((Intent) gVar5.f9475s.remove(0)).equals(gVar5.f9476t)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            gVar5.f9476t = null;
                        }
                        i iVar = (i) ((l) gVar5.f9470b).f43b;
                        b bVar = gVar5.f9473f;
                        synchronized (bVar.f9452c) {
                            zIsEmpty = bVar.f9451b.isEmpty();
                            break;
                        }
                        if (zIsEmpty && gVar5.f9475s.isEmpty()) {
                            synchronized (iVar.f2817c) {
                                zIsEmpty2 = iVar.f2815a.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                m.d().a(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = gVar5.f9477u;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!gVar5.f9475s.isEmpty()) {
                                gVar5.f();
                            }
                        } else if (!gVar5.f9475s.isEmpty()) {
                            gVar5.f();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
