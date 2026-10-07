package androidx.webkit;

import a2.l;
import android.app.job.JobParameters;
import android.database.SQLException;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.SettingsActivity;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import bd.n;
import c3.j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import g.a0;
import gb.m;
import ib.c;
import j3.d;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import k3.r;
import l3.t;
import l3.y;
import l5.i;
import l5.q;
import n3.h;
import x9.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1225c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f1223a = i;
        this.f1224b = obj;
        this.f1225c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ya.a aVar;
        switch (this.f1223a) {
            case 0:
                ((WebViewCompat.WebViewStartUpCallback) this.f1224b).onSuccess((WebViewStartUpResult) this.f1225c);
                return;
            case 1:
                a0 a0Var = (a0) this.f1224b;
                Runnable runnable = (Runnable) this.f1225c;
                a0Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    a0Var.a();
                }
            case 2:
                ((g0.b) this.f1224b).h((Typeface) this.f1225c);
                return;
            case 3:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1224b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1225c;
                c cVar = FirebaseMessaging.f2726m;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 4:
                m mVar = (m) this.f1224b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f1225c;
                try {
                    taskCompletionSource2.setResult(mVar.c());
                    return;
                } catch (Exception e4) {
                    taskCompletionSource2.setException(e4);
                    return;
                }
            case 5:
                SettingsActivity settingsActivity = (SettingsActivity) this.f1224b;
                String str = (String) this.f1225c;
                int i = SettingsActivity.f1300e0;
                Button button = (Button) settingsActivity.findViewById(app.namso_gen.spacehowen.R.id.btnSubscribe);
                if (button != null) {
                    button.setText(str);
                    return;
                }
                return;
            case 6:
                ja.c cVar2 = (ja.c) this.f1224b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1225c;
                try {
                    q.a().f6842d.m(((i) cVar2.h.f1677c).b(i5.c.f5211c), 1);
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 7:
                ServerSocket serverSocket = (ServerSocket) this.f1224b;
                n nVar = (n) this.f1225c;
                while (!serverSocket.isClosed()) {
                    try {
                        Socket socketAccept = serverSocket.accept();
                        jc.i.b(socketAccept);
                        ((ExecutorService) nVar.f1624g).execute(new b(8, nVar, socketAccept));
                    } catch (Throwable th) {
                        if (!serverSocket.isClosed()) {
                            Log.w("krypt-router", "accept transitorio: " + th.getMessage());
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                        Log.i("krypt-router", "loop de accept terminado");
                        return;
                    }
                }
                Log.i("krypt-router", "loop de accept terminado");
                return;
            case 8:
                try {
                    ((n) this.f1224b).e((Socket) this.f1225c);
                    return;
                } catch (Throwable th2) {
                    Log.w("krypt-router", "handle falló: " + th2);
                    return;
                }
            case 9:
                ServerSocket serverSocket2 = (ServerSocket) this.f1224b;
                r rVar = (r) this.f1225c;
                while (!serverSocket2.isClosed()) {
                    try {
                        Socket socketAccept2 = serverSocket2.accept();
                        jc.i.b(socketAccept2);
                        Log.d("krypt-relay", "cliente conectado desde " + socketAccept2.getRemoteSocketAddress());
                        rVar.f5973f.execute(new b(10, rVar, socketAccept2));
                    } catch (Throwable th3) {
                        if (!serverSocket2.isClosed()) {
                            Log.w("krypt-relay", "accept transitorio: " + th3.getMessage());
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException unused3) {
                            }
                        }
                        Log.i("krypt-relay", "loop de accept terminado");
                        return;
                    }
                }
                Log.i("krypt-relay", "loop de accept terminado");
                return;
            case 10:
                try {
                    ((r) this.f1224b).d((Socket) this.f1225c);
                    return;
                } catch (Throwable th4) {
                    Log.w("krypt-relay", "handle falló: " + th4);
                    return;
                }
            case 11:
                n3.b bVar = (n3.b) this.f1224b;
                t tVar = (t) this.f1225c;
                n3.i iVar = n3.i.f7270a;
                h hVarJ = n3.i.j(bVar.f7241d, bVar.f7242f, bVar.e, bVar.f7243g, bVar.h);
                d dVar = tVar.f6678f0;
                if (!hVarJ.f7264a || dVar == null) {
                    return;
                }
                Long l2 = tVar.f6680h0;
                long j4 = bVar.f7238a;
                if (l2 != null && l2.longValue() == j4) {
                    dVar.f5682o.post(new androidx.emoji2.text.m(tVar, bVar, hVarJ, 5));
                    return;
                }
                return;
            case 12:
                y yVar = (y) this.f1224b;
                String str2 = (String) this.f1225c;
                j jVar = yVar.f6737v0;
                if (jVar == null || !((TextView) jVar.f1759a).isEnabled()) {
                    return;
                }
                j jVar2 = yVar.f6737v0;
                jc.i.b(jVar2);
                ((TextView) jVar2.f1759a).setText(yVar.w(app.namso_gen.spacehowen.R.string.premium_proxy_buy_pack_format, str2));
                return;
            case 13:
                n3.b bVar2 = (n3.b) this.f1224b;
                ProfileViewerActivity profileViewerActivity = (ProfileViewerActivity) this.f1225c;
                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                n3.i iVar2 = n3.i.f7270a;
                h hVarJ2 = n3.i.j(bVar2.f7241d, bVar2.f7242f, bVar2.e, bVar2.f7243g, bVar2.h);
                if (!hVarJ2.f7264a || profileViewerActivity.isFinishing() || profileViewerActivity.isDestroyed()) {
                    return;
                }
                profileViewerActivity.runOnUiThread(new b(14, profileViewerActivity, hVarJ2));
                return;
            case 14:
                ProfileViewerActivity profileViewerActivity2 = (ProfileViewerActivity) this.f1224b;
                h hVar = (h) this.f1225c;
                b9.j jVar3 = profileViewerActivity2.K;
                if (jVar3 == null) {
                    jc.i.i("vb");
                    throw null;
                }
                ((LinearLayout) jVar3.h).setVisibility(0);
                String str3 = hVar.f7267d;
                int i10 = hVar.f7269g;
                if (str3 == null || i10 < 2) {
                    b9.j jVar4 = profileViewerActivity2.K;
                    if (jVar4 == null) {
                        jc.i.i("vb");
                        throw null;
                    }
                    ((TextView) jVar4.i).setText("❔");
                    b9.j jVar5 = profileViewerActivity2.K;
                    if (jVar5 != null) {
                        ((TextView) jVar5.f1475j).setText(profileViewerActivity2.getString(app.namso_gen.spacehowen.R.string.viewer_connected_unknown));
                        return;
                    } else {
                        jc.i.i("vb");
                        throw null;
                    }
                }
                b9.j jVar6 = profileViewerActivity2.K;
                if (jVar6 == null) {
                    jc.i.i("vb");
                    throw null;
                }
                ((TextView) jVar6.i).setText(n3.d.a(str3));
                b9.j jVar7 = profileViewerActivity2.K;
                if (jVar7 != null) {
                    ((TextView) jVar7.f1475j).setText(profileViewerActivity2.getString(app.namso_gen.spacehowen.R.string.viewer_connected, n3.d.e(str3)));
                    return;
                } else {
                    jc.i.i("vb");
                    throw null;
                }
            case 15:
                m3.b bVar3 = (m3.b) this.f1224b;
                String str4 = (String) this.f1225c;
                if (bVar3.f7048v0 == null || str4 == null) {
                    return;
                }
                String strW = bVar3.w(app.namso_gen.spacehowen.R.string.sub_price_per_month, str4);
                jc.i.d(strW, "getString(...)");
                l lVar = bVar3.f7048v0;
                jc.i.b(lVar);
                ((Button) lVar.f44c).setText(bVar3.w(app.namso_gen.spacehowen.R.string.sub_btn_subscribe_format, strW));
                return;
            case 16:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f1224b;
                JobParameters jobParameters = (JobParameters) this.f1225c;
                int i11 = JobInfoSchedulerService.f1958a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 17:
                o oVar = (o) this.f1224b;
                ya.b bVar4 = (ya.b) this.f1225c;
                if (oVar.f10348b != o.f10346d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    aVar = oVar.f10347a;
                    oVar.f10347a = null;
                    oVar.f10348b = bVar4;
                    break;
                }
                aVar.b(bVar4);
                return;
            case 18:
                x9.n nVar2 = (x9.n) this.f1224b;
                ya.b bVar5 = (ya.b) this.f1225c;
                synchronized (nVar2) {
                    try {
                        if (nVar2.f10344b == null) {
                            nVar2.f10343a.add(bVar5);
                        } else {
                            nVar2.f10344b.add(bVar5.get());
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return;
            case 19:
                Runnable runnable2 = (Runnable) this.f1224b;
                a0 a0Var2 = (a0) this.f1225c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    a0Var2.a();
                }
            case 20:
                y9.a aVar2 = (y9.a) this.f1224b;
                Runnable runnable3 = (Runnable) this.f1225c;
                Process.setThreadPriority(aVar2.f10636c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f10637d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable3.run();
                return;
            default:
                Callable callable = (Callable) this.f1224b;
                y9.h hVar2 = (y9.h) ((ta.c) this.f1225c).f8662a;
                try {
                    hVar2.i(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar2.j(e10);
                    return;
                }
        }
    }
}
