package bd;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.c0;
import fa.h0;
import fa.i0;
import fa.k1;
import fa.p0;
import fa.q0;
import fa.t1;
import h6.o0;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l.k2;
import l.l1;
import l.y2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1683d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1685g;

    public /* synthetic */ v(int i) {
        this.f1680a = i;
    }

    public static h0 a(h0 h0Var, ea.c cVar, v vVar) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        u uVar = new u(1);
        uVar.f1677c = Long.valueOf(h0Var.f3741a);
        uVar.f1676b = h0Var.f3742b;
        uVar.f1678d = h0Var.f3743c;
        uVar.e = h0Var.f3744d;
        uVar.f1679f = h0Var.e;
        String strE = ((ea.a) cVar.f3510b).e();
        if (strE != null) {
            uVar.f1679f = new q0(strE);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ea.b bVar = (ea.b) ((AtomicMarkableReference) ((com.bumptech.glide.manager.q) vVar.e).f1933b).getReference();
        synchronized (bVar) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(bVar.f3505a));
        }
        ArrayList arrayListJ = j(mapUnmodifiableMap);
        ea.b bVar2 = (ea.b) ((AtomicMarkableReference) ((com.bumptech.glide.manager.q) vVar.f1684f).f1933b).getReference();
        synchronized (bVar2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(bVar2.f3505a));
        }
        ArrayList arrayListJ2 = j(mapUnmodifiableMap2);
        if (!arrayListJ.isEmpty() || !arrayListJ2.isEmpty()) {
            i0 i0Var = (i0) h0Var.f3743c;
            k1 k1Var = i0Var.f3752a;
            Boolean bool = i0Var.f3755d;
            int i = i0Var.e;
            t1 t1Var = new t1(arrayListJ);
            t1 t1Var2 = new t1(arrayListJ2);
            String str = k1Var == null ? " execution" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            uVar.f1678d = new i0(k1Var, t1Var, t1Var2, bool, i);
        }
        return uVar.b();
    }

    public static boolean c(int[] iArr, int i) {
        for (int i10 : iArr) {
            if (i10 == i) {
                return true;
            }
        }
        return false;
    }

    public static v f(Context context, da.z zVar, ia.b bVar, da.a aVar, ea.c cVar, v vVar, o0 o0Var, c3.j jVar, aa.c cVar2, da.l lVar) {
        da.t tVar = new da.t(context, zVar, aVar, o0Var, jVar);
        ia.a aVar2 = new ia.a(bVar, jVar, lVar);
        ga.c cVar3 = ja.a.f5718b;
        l5.q.b(context);
        return new v(tVar, aVar2, new ja.a(new ja.c(l5.q.a().c(new j5.a(ja.a.f5719c, ja.a.f5720d)).a("FIREBASE_CRASHLYTICS_REPORT", new i5.b("json"), ja.a.e), jVar.h(), cVar2)), cVar, vVar, zVar);
    }

    public static ColorStateList g(Context context, int i) {
        int iC = y2.c(context, R.attr.colorControlHighlight);
        int iB = y2.b(context, R.attr.colorButtonNormal);
        int[] iArr = y2.f6491b;
        int[] iArr2 = y2.f6493d;
        int iB2 = h0.a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, y2.f6492c, y2.f6494f}, new int[]{iB, iB2, h0.a.b(iC, i), i});
    }

    public static LayerDrawable i(k2 k2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = k2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = k2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static ArrayList j(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new fa.a0(str, str2));
        }
        Collections.sort(arrayList, new da.j(1));
        return arrayList;
    }

    public static void p(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = l1.f6340a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = l.r.f6403b;
        }
        drawableMutate.setColorFilter(l.r.c(i, mode));
    }

    public void b(String str, String str2) {
        HashMap map = (HashMap) this.f1685g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public p0 d() {
        String strH = ((Integer) this.f1681b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.f1683d) == null) {
            strH = strH.concat(" proximityOn");
        }
        if (((Integer) this.e) == null) {
            strH = da.v.h(strH, " orientation");
        }
        if (((Long) this.f1684f) == null) {
            strH = da.v.h(strH, " ramUsed");
        }
        if (((Long) this.f1685g) == null) {
            strH = da.v.h(strH, " diskUsed");
        }
        if (strH.isEmpty()) {
            return new p0((Double) this.f1682c, ((Integer) this.f1681b).intValue(), ((Boolean) this.f1683d).booleanValue(), ((Integer) this.e).intValue(), ((Long) this.f1684f).longValue(), ((Long) this.f1685g).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public l5.h e() {
        String strH = ((String) this.f1681b) == null ? " transportName" : "";
        if (((l5.l) this.f1683d) == null) {
            strH = strH.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            strH = da.v.h(strH, " eventMillis");
        }
        if (((Long) this.f1684f) == null) {
            strH = da.v.h(strH, " uptimeMillis");
        }
        if (((HashMap) this.f1685g) == null) {
            strH = da.v.h(strH, " autoMetadata");
        }
        if (strH.isEmpty()) {
            return new l5.h((String) this.f1681b, (Integer) this.f1682c, (l5.l) this.f1683d, ((Long) this.e).longValue(), ((Long) this.f1684f).longValue(), (HashMap) this.f1685g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public Task h(Task task) {
        return task.continueWith(new androidx.webkit.a(3), new a5.a(this, 8));
    }

    public ColorStateList k(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return e0.k.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230827) {
            return e0.k.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return g(context, y2.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return g(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return g(context, y2.c(context, R.attr.colorAccent));
            }
            if (i == 2131230822 || i == R.drawable.abc_spinner_textfield_background_material) {
                return e0.k.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (c((int[]) this.f1681b, i)) {
                return y2.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.f1684f, i)) {
                return e0.k.getColorStateList(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.f1685g, i)) {
                return e0.k.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return e0.k.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = y2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = y2.f6491b;
            iArr2[0] = y2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = y2.e;
            iArr2[1] = y2.c(context, R.attr.colorControlActivated);
            iArr[2] = y2.f6494f;
            iArr2[2] = y2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = y2.f6491b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = y2.e;
            iArr2[1] = y2.c(context, R.attr.colorControlActivated);
            iArr[2] = y2.f6494f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public u l() {
        u uVar = new u(false);
        uVar.f1679f = new LinkedHashMap();
        uVar.f1677c = (o) this.f1682c;
        uVar.f1676b = (String) this.f1681b;
        uVar.e = (bb.b) this.e;
        Map map = (Map) this.f1684f;
        uVar.f1679f = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f1678d = ((m) this.f1683d).h();
        return uVar;
    }

    public Task m(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList arrayListB = ((ia.a) this.f1681b).b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            File file = (File) arrayListB.get(i);
            try {
                ga.c cVar = ia.a.f5240g;
                String strE = ia.a.e(file);
                cVar.getClass();
                arrayList.add(new da.b(ga.c.h(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
            i = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = i11 + 1;
            da.b bVar = (da.b) arrayList.get(i11);
            if (str == null || str.equals(bVar.f3091b)) {
                ja.a aVar = (ja.a) this.f1683d;
                if (bVar.f3090a.f3877f == null) {
                    try {
                        str2 = (String) c0.a(((za.c) ((da.z) this.f1685g).f3174d).c());
                    } catch (Exception e4) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e4);
                        str2 = null;
                    }
                    fa.w wVarA = bVar.f3090a.a();
                    wVarA.f3868d = str2;
                    bVar = new da.b(wVarA.b(), bVar.f3091b, bVar.f3092c);
                }
                boolean z4 = str != null;
                ja.c cVar2 = aVar.f5721a;
                synchronized (cVar2.f5730f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z4) {
                            ((AtomicInteger) cVar2.i.f263b).getAndIncrement();
                            if (cVar2.f5730f.size() < cVar2.e) {
                                aa.d dVar = aa.d.f265a;
                                dVar.b("Enqueueing report: " + bVar.f3091b);
                                dVar.b("Queue size: " + cVar2.f5730f.size());
                                cVar2.f5731g.execute(new b3.b(cVar2, bVar, taskCompletionSource, 5));
                                dVar.b("Closing task for report: " + bVar.f3091b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar2.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.f3091b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar2.i.f264c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar2.b(bVar, taskCompletionSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new a5.f(this)));
            }
            i11 = i12;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void n(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zJ;
        int i10;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        n9.g gVar = (n9.g) this.f1682c;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f7361c.f7367b);
        gb.n nVar = (gb.n) this.f1681b;
        synchronized (nVar) {
            try {
                if (nVar.f4481a == 0 && (packageInfoC = nVar.c("com.google.android.gms")) != null) {
                    nVar.f4481a = packageInfoC.versionCode;
                }
                i = nVar.f4481a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((gb.n) this.f1681b).a());
        gb.n nVar2 = (gb.n) this.f1681b;
        synchronized (nVar2) {
            try {
                if (((String) nVar2.e) == null) {
                    nVar2.f();
                }
                str3 = (String) nVar2.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        n9.g gVar2 = (n9.g) this.f1682c;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f7360b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((za.a) Tasks.await(((za.c) ((za.d) this.f1685g)).d())).f11531a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e4) {
            e = e4;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(((za.c) ((za.d) this.f1685g)).c()));
        bundle.putString("cliv", "fcm-23.2.1");
        wa.f fVar = (wa.f) ((ya.b) this.f1684f).get();
        ib.b bVar = (ib.b) ((ya.b) this.e).get();
        if (fVar == null || bVar == null) {
            return;
        }
        wa.c cVar = (wa.c) fVar;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            p7.b bVar2 = (p7.b) cVar.f9877a.get();
            synchronized (bVar2) {
                zJ = bVar2.j(jCurrentTimeMillis);
            }
            if (zJ) {
                synchronized (bVar2) {
                    String strE = bVar2.e(System.currentTimeMillis());
                    ((SharedPreferences) bVar2.f7823a).edit().putString("last-used-date", strE).commit();
                    bVar2.i(strE);
                }
                i10 = 3;
            } else {
                i10 = 1;
            }
        }
        if (i10 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(u.e.d(i10)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public void o(String str) {
        com.bumptech.glide.manager.q qVar = (com.bumptech.glide.manager.q) this.f1684f;
        synchronized (qVar) {
            try {
                if (((ea.b) ((AtomicMarkableReference) qVar.f1933b).getReference()).a(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.f1933b;
                    atomicMarkableReference.set((ea.b) atomicMarkableReference.getReference(), true);
                    androidx.webkit.internal.a aVar = new androidx.webkit.internal.a(qVar, 2);
                    AtomicReference atomicReference = (AtomicReference) qVar.f1934c;
                    while (!atomicReference.compareAndSet(null, aVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((a3.j) ((v) qVar.f1935d).f1683d).d(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task q(String str, String str2, Bundle bundle) {
        int i;
        int i10;
        PackageInfo packageInfoF;
        try {
            n(str, str2, bundle);
            f7.a aVar = (f7.a) this.f1683d;
            f7.l lVar = aVar.f3617c;
            synchronized (lVar) {
                if (lVar.f3642a == 0) {
                    try {
                        packageInfoF = p7.c.a((Context) lVar.f3644c).f(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e) {
                        String strValueOf = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("Failed to find package ");
                        sb2.append(strValueOf);
                        Log.w("Metadata", sb2.toString());
                        packageInfoF = null;
                    }
                    if (packageInfoF != null) {
                        lVar.f3642a = packageInfoF.versionCode;
                    }
                }
                i = lVar.f3642a;
            }
            if (i < 12000000) {
                return aVar.f3617c.b() != 0 ? aVar.a(bundle).continueWithTask(f7.n.f3647a, new aa.c(24, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            f7.k kVarB = f7.k.b(aVar.f3616b);
            synchronized (kVarB) {
                i10 = kVarB.f3638a;
                kVarB.f3638a = i10 + 1;
            }
            return kVarB.c(new f7.i(i10, 1, bundle, 1)).continueWith(f7.n.f3647a, f7.m.f3645a);
        } catch (InterruptedException | ExecutionException e4) {
            return Tasks.forException(e4);
        }
    }

    public String toString() {
        switch (this.f1680a) {
            case 0:
                Map map = (Map) this.f1684f;
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.f1681b);
                sb2.append(", url=");
                sb2.append((o) this.f1682c);
                m mVar = (m) this.f1683d;
                if (mVar.size() != 0) {
                    sb2.append(", headers=[");
                    int i = 0;
                    for (Object obj : mVar) {
                        int i10 = i + 1;
                        if (i < 0) {
                            vb.j.T();
                            throw null;
                        }
                        ub.f fVar = (ub.f) obj;
                        String str = (String) fVar.f9065a;
                        String str2 = (String) fVar.f9066b;
                        if (i > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(str);
                        sb2.append(':');
                        sb2.append(str2);
                        i = i10;
                    }
                    sb2.append(']');
                }
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String string = sb2.toString();
                jc.i.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public v(Context context, String str) {
        String strConcat;
        this.f1680a = 1;
        this.f1682c = context.getApplicationContext();
        this.f1681b = str;
        this.f1683d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + p7.c.a(context).f(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            i6.h.e("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f1685g = strConcat;
    }

    public v(o oVar, String str, m mVar, bb.b bVar, Map map) {
        this.f1680a = 0;
        jc.i.e(oVar, "url");
        jc.i.e(str, "method");
        this.f1682c = oVar;
        this.f1681b = str;
        this.f1683d = mVar;
        this.e = bVar;
        this.f1684f = map;
    }

    public v() {
        this.f1680a = 7;
        this.f1682c = new int[]{2131230837, 2131230835, 2131230761};
        this.f1681b = new int[]{2131230785, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f1683d = new int[]{2131230834, 2131230836, 2131230778, R.drawable.abc_text_cursor_material, 2131230831, 2131230832, 2131230833};
        this.e = new int[]{2131230810, R.drawable.abc_cab_background_internal_bg, 2131230809};
        this.f1684f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f1685g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public v(String str, ia.b bVar, a3.j jVar) {
        this.f1680a = 3;
        this.e = new com.bumptech.glide.manager.q(this, false);
        this.f1684f = new com.bumptech.glide.manager.q(this, true);
        this.f1685g = new AtomicMarkableReference(null, false);
        this.f1681b = str;
        this.f1682c = new ea.d(bVar);
        this.f1683d = jVar;
    }

    public v(da.t tVar, ia.a aVar, ja.a aVar2, ea.c cVar, v vVar, da.z zVar) {
        this.f1680a = 2;
        this.f1682c = tVar;
        this.f1681b = aVar;
        this.f1683d = aVar2;
        this.e = cVar;
        this.f1684f = vVar;
        this.f1685g = zVar;
    }

    public v(n9.g gVar, gb.n nVar, ya.b bVar, ya.b bVar2, za.d dVar) {
        this.f1680a = 5;
        gVar.a();
        f7.a aVar = new f7.a(gVar.f7359a);
        this.f1682c = gVar;
        this.f1681b = nVar;
        this.f1683d = aVar;
        this.e = bVar;
        this.f1684f = bVar2;
        this.f1685g = dVar;
    }

    public v(ed.d dVar) {
        this.f1680a = 6;
        jc.i.e(dVar, "taskRunner");
        this.f1682c = dVar;
        this.f1685g = id.h.f5284a;
    }
}
