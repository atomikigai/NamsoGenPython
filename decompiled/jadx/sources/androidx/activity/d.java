package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import androidx.webkit.WebViewCompat;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f347b;

    public /* synthetic */ d(gb.k kVar, Intent intent) {
        this.f346a = 12;
        this.f347b = intent;
    }

    private final void a() {
        bd.u uVar = (bd.u) this.f347b;
        synchronized (((ArrayDeque) uVar.e)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) uVar.f1677c).edit();
            String str = (String) uVar.f1676b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) uVar.e).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) uVar.f1678d);
            }
            editorEdit.putString(str, sb2.toString()).commit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r10;
        ?? r11;
        int i = 28;
        Application application = 2;
        char c10 = 2;
        d0.d dVar = 1;
        dVar = 1;
        boolean z4 = false;
        switch (this.f346a) {
            case 0:
                ((m) this.f347b).invalidateOptionsMenu();
                return;
            case 1:
                l lVar = (l) this.f347b;
                Runnable runnable = lVar.f361b;
                if (runnable != null) {
                    runnable.run();
                    lVar.f361b = null;
                    return;
                }
                return;
            case 2:
                n.a((n) this.f347b);
                return;
            case 3:
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f347b;
                synchronized (rVar.f796d) {
                    try {
                        if (rVar.f799s == null) {
                            return;
                        }
                        try {
                            n0.g gVarB = rVar.b();
                            int i10 = gVarB.e;
                            if (i10 == 2) {
                                synchronized (rVar.f796d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = m0.n.f6974a;
                                m0.m.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                z9.c cVar = rVar.f795c;
                                Context context = rVar.f793a;
                                cVar.getClass();
                                Typeface typefaceK = h0.g.f4552a.k(context, new n0.g[]{gVarB}, 0);
                                MappedByteBuffer mappedByteBufferO = jd.l.o(rVar.f793a, gVarB.f7144a);
                                if (mappedByteBufferO == null || typefaceK == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    m0.m.a("EmojiCompat.MetadataRepo.create");
                                    a3.j jVar = new a3.j(typefaceK, n9.b.y(mappedByteBufferO));
                                    m0.m.b();
                                    m0.m.b();
                                    synchronized (rVar.f796d) {
                                        try {
                                            jd.l lVar2 = rVar.f799s;
                                            if (lVar2 != null) {
                                                lVar2.s(jVar);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    rVar.a();
                                    return;
                                } catch (Throwable th2) {
                                    int i12 = m0.n.f6974a;
                                    m0.m.b();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                int i13 = m0.n.f6974a;
                                m0.m.b();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (rVar.f796d) {
                                try {
                                    jd.l lVar3 = rVar.f799s;
                                    if (lVar3 != null) {
                                        lVar3.r(th4);
                                    }
                                    rVar.a();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 4:
                androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) this.f347b;
                androidx.lifecycle.t tVar = d0Var.f1043f;
                if (d0Var.f1040b == 0) {
                    d0Var.f1041c = true;
                    tVar.d(androidx.lifecycle.l.ON_PAUSE);
                }
                if (d0Var.f1039a == 0 && d0Var.f1041c) {
                    tVar.d(androidx.lifecycle.l.ON_STOP);
                    d0Var.f1042d = true;
                    return;
                }
                return;
            case 5:
                WebViewCompat.lambda$startUpWebView$2((WebViewCompat.WebViewStartUpCallback) this.f347b);
                return;
            case 6:
                c9.f fVar = (c9.f) this.f347b;
                fVar.f1816b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) fVar.e;
                y0.d dVar2 = sideSheetBehavior.i;
                if (dVar2 != null && dVar2.f()) {
                    fVar.b(fVar.f1817c);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(fVar.f1817c);
                        return;
                    }
                    return;
                }
            case 7:
                ((com.google.android.material.timepicker.e) this.f347b).m();
                return;
            case 8:
                Activity activity = (Activity) this.f347b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = d0.e.f2757g;
                Method method = d0.e.f2756f;
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i14 != 26 && i14 != 27) || method != null) && (d0.e.e != null || d0.e.f2755d != null)) {
                    try {
                        Object obj2 = d0.e.f2754c.get(activity);
                        if (obj2 != null && (obj = d0.e.f2753b.get(activity)) != null) {
                            application = activity.getApplication();
                            dVar = new d0.d(activity);
                            application.registerActivityLifecycleCallbacks(dVar);
                            handler.post(new a3.e(dVar, obj2, c10, z4));
                            if (i14 != 26 && i14 != 27) {
                                dVar = 0;
                            }
                            int i15 = 3;
                            try {
                                if (dVar != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r11 = application;
                                        r10 = dVar;
                                        handler.post(new a3.e(r11, r10, i15, z4));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new a3.e(application, dVar, i15, z4));
                                return;
                            } catch (Throwable th8) {
                                th = th8;
                                r11 = application;
                                r10 = dVar;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 9:
                ((g9.d) this.f347b).s(true);
                return;
            case 10:
                g9.l lVar4 = (g9.l) this.f347b;
                boolean zIsPopupShowing = lVar4.h.isPopupShowing();
                lVar4.s(zIsPopupShowing);
                lVar4.f4343m = zIsPopupShowing;
                return;
            case 11:
                ((TextInputLayout) this.f347b).f2544d.requestLayout();
                return;
            case 12:
                gb.k.a((Intent) this.f347b);
                return;
            case 13:
                a();
                return;
            case 14:
                gb.c0 c0Var = (gb.c0) this.f347b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + c0Var.f4448a.getAction() + " finishing.");
                c0Var.f4449b.trySetResult(null);
                return;
            case 15:
                ((h3.m) this.f347b).f4766u.setTextIsSelectable(true);
                return;
            case 16:
                ((CarouselLayoutManager) this.f347b).n0();
                return;
            case 17:
                a3.j jVar2 = (a3.j) this.f347b;
                ((s5.i) ((t5.c) jVar2.f110d)).E(new a5.a(jVar2, i));
                return;
            case 18:
                u4.f fVar2 = (u4.f) this.f347b;
                fVar2.f8861j0 = 0L;
                fVar2.f8860i0.setVisibility(8);
                fVar2.f8858g0.setVisibility(8);
                return;
            case 19:
                ((w4.g) ((r4.j) this.f347b).f8170f).f9609m0.setVisibility(0);
                return;
            default:
                ((y4.g) this.f347b).b0();
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i) {
        this.f346a = i;
        this.f347b = obj;
    }
}
