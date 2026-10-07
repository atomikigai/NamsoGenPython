package a2;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.fragment.app.b0;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.data.NotesDatabase;
import h3.a2;
import h3.q1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8b;

    public /* synthetic */ d(Object obj, int i) {
        this.f7a = i;
        this.f8b = obj;
    }

    @Override // ic.a
    public final Object a() {
        i2.h hVar;
        switch (this.f7a) {
            case 0:
                return ((s5.j) this.f8b).h(":memory:");
            case 1:
                ((androidx.activity.m) this.f8b).reportFullyDrawn();
                return null;
            case 2:
                CheckerHistoryActivity checkerHistoryActivity = (CheckerHistoryActivity) this.f8b;
                int i = CheckerHistoryActivity.Q;
                return NotesDatabase.f1305l.a(checkerHistoryActivity).s();
            case 3:
                return NotesDatabase.f1305l.a(((a2) this.f8b).U()).t();
            case 4:
                NotificationHistoryActivity notificationHistoryActivity = (NotificationHistoryActivity) this.f8b;
                int i10 = NotificationHistoryActivity.O;
                return NotesDatabase.f1305l.a(notificationHistoryActivity).u();
            case 5:
                i2.i iVar = (i2.i) this.f8b;
                h2.c cVar = iVar.f5153c;
                Context context = iVar.f5151a;
                String str = iVar.f5152b;
                if (str == null || !iVar.f5154d) {
                    hVar = new i2.h(context, str, new e7.i(22), cVar);
                } else {
                    jc.i.e(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    jc.i.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    hVar = new i2.h(context, new File(noBackupFilesDir, str).getAbsolutePath(), new e7.i(22), cVar);
                }
                hVar.setWriteAheadLoggingEnabled(iVar.f5155f);
                return hVar;
            case 6:
                l3.t tVar = (l3.t) this.f8b;
                Log.i("KRYPT-PROXY", "releaseAllEmbedded → liberando " + tVar.f6679g0.size() + " WebView(s) embebidos");
                Iterator it = new ArrayList(tVar.f6679g0.keySet()).iterator();
                jc.i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    WebView webView = (WebView) tVar.f6679g0.remove(l2);
                    if (webView != null) {
                        if (webView.getParent() != null) {
                            ViewParent parent = webView.getParent();
                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(webView);
                            }
                        }
                        try {
                            webView.destroy();
                        } catch (Throwable th) {
                            r7.g.m(th);
                        }
                    }
                    jc.i.b(l2);
                    if (!n9.b.j(l2.longValue())) {
                        n9.b.e(l2.longValue());
                    }
                    break;
                }
                tVar.f6681i0.clear();
                tVar.f6680h0 = null;
                j3.d dVar = tVar.f6678f0;
                if (dVar != null) {
                    dVar.f5678k.removeAllViews();
                    dVar.f5677j.setVisibility(8);
                    dVar.i.setVisibility(0);
                    q1 q1Var = qd.b.f8070b;
                    if (q1Var != null) {
                        q1Var.invoke(Boolean.FALSE);
                    }
                }
                b0 b0Var = tVar.f6682j0;
                if (b0Var != null) {
                    b0Var.a(false);
                }
                tVar.f6684m0.k();
                tVar.l0();
                return ub.k.f9073a;
            default:
                c5.a aVar = (c5.a) this.f8b;
                String strC = aVar.c();
                y1.v vVar = (y1.v) aVar.f1774a;
                vVar.getClass();
                vVar.a();
                vVar.b();
                return vVar.i().z().k(strC);
        }
    }
}
