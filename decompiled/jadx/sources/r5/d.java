package r5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c3.j;
import java.util.Objects;
import l5.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f8184d;

    public /* synthetic */ d(j jVar, i iVar, int i, Runnable runnable) {
        this.f8181a = jVar;
        this.f8182b = iVar;
        this.f8183c = i;
        this.f8184d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final i iVar = this.f8182b;
        final int i = this.f8183c;
        Runnable runnable = this.f8184d;
        final j jVar = this.f8181a;
        t5.c cVar = (t5.c) jVar.f1763f;
        try {
            s5.d dVar = (s5.d) jVar.f1761c;
            Objects.requireNonNull(dVar);
            ((s5.i) cVar).E(new a5.a(dVar, 26));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) jVar.f1759a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((s5.i) cVar).E(new t5.b() { // from class: r5.e
                    @Override // t5.b
                    public final Object f() {
                        ((q5.d) jVar.f1762d).i(iVar, i + 1, false);
                        return null;
                    }
                });
            } else {
                jVar.m(iVar, i);
            }
        } catch (t5.a unused) {
            ((q5.d) jVar.f1762d).i(iVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
