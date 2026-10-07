package p3;

import a4.g;
import a4.h0;
import a4.m;
import a4.n;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.j0;
import app.namso_gen.spacehowen.R;
import bd.b0;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzftn;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfxd;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.a0;
import d4.d0;
import d4.l;
import d4.o;
import d4.s;
import da.v;
import i0.b;
import i3.p;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import jc.i;
import jc.t;
import l.j3;
import l.l3;
import oc.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.a1;
import q0.c0;
import q0.v0;
import rc.f0;
import t.h;
import t.j;
import t.k;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f7787a = true;

    public static void a(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = dc.a.f3178a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = cc.a.f1819a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static j c(f0 f0Var) {
        h hVar = new h();
        hVar.f8514c = new k();
        j jVar = new j(hVar);
        hVar.f8513b = jVar;
        hVar.f8512a = q1.a.class;
        try {
            f0Var.I(false, true, new q1.b(0, hVar, f0Var));
            hVar.f8512a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e) {
            jVar.f8518b.j(e);
            return jVar;
        }
    }

    public static void d(StringBuilder sb2, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static n3.b e(long j4) {
        Object next;
        Iterator it = n().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((n3.b) next).f7238a == j4) {
                return (n3.b) next;
            }
        }
        next = null;
        return (n3.b) next;
    }

    public static final void f(View view) {
        i.e(view, "<this>");
        f fVarT = d.t(new a1(view, null));
        while (fVarT.hasNext()) {
            View view2 = (View) fVarT.next();
            w0.a aVar = (w0.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new w0.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f9446a;
            int iR = vb.j.R(arrayList);
            if (-1 < iR) {
                throw v.e(arrayList, iR);
            }
        }
    }

    public static void g(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
    }

    public static ImageView.ScaleType h(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static com.bumptech.glide.h i(com.bumptech.glide.b bVar, ArrayList arrayList) {
        u3.k eVar;
        u3.k aVar;
        Class cls;
        x3.a aVar2 = bVar.f1839a;
        x3.f fVar = bVar.f1842d;
        e eVar2 = bVar.f1841c;
        Context applicationContext = eVar2.getApplicationContext();
        a5.b bVar2 = eVar2.h;
        com.bumptech.glide.h hVar = new com.bumptech.glide.h();
        Class<InputStream> cls2 = InputStream.class;
        l lVar = new l();
        k4.b bVar3 = hVar.f1871g;
        synchronized (bVar3) {
            bVar3.f5977a.add(lVar);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            s sVar = new s();
            k4.b bVar4 = hVar.f1871g;
            synchronized (bVar4) {
                bVar4.f5977a.add(sVar);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = hVar.e();
        h4.a aVar3 = new h4.a(applicationContext, arrayListE, aVar2, fVar);
        d0 d0Var = new d0(aVar2, new b9.e(11));
        o oVar = new o(hVar.e(), resources.getDisplayMetrics(), aVar2, fVar);
        if (i < 28 || !((Map) bVar2.f188b).containsKey(c.class)) {
            eVar = new d4.e(oVar, 0);
            aVar = new d4.a(2, oVar, fVar);
        } else {
            aVar = new d4.f(1);
            eVar = new d4.f(0);
        }
        if (i >= 28) {
            hVar.d("Animation", InputStream.class, Drawable.class, new f4.b(new f4.c(arrayListE, fVar), 1));
            hVar.d("Animation", ByteBuffer.class, Drawable.class, new f4.b(new f4.c(arrayListE, fVar), 0));
        }
        f4.e eVar3 = new f4.e(applicationContext);
        d4.b bVar5 = new d4.b(fVar);
        ea.j jVar = new ea.j();
        i4.d dVar = new i4.d(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        hVar.b(ByteBuffer.class, new h0(5));
        hVar.b(InputStream.class, new e7.i(fVar, 4));
        hVar.d("Bitmap", ByteBuffer.class, Bitmap.class, eVar);
        hVar.d("Bitmap", InputStream.class, Bitmap.class, aVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            d4.e eVar4 = new d4.e(oVar, 1);
            cls = ParcelFileDescriptor.class;
            hVar.d("Bitmap", cls, Bitmap.class, eVar4);
        }
        hVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new d0(aVar2, new b9.e(10)));
        hVar.d("Bitmap", cls, Bitmap.class, d0Var);
        h0 h0Var = h0.f147b;
        hVar.a(Bitmap.class, Bitmap.class, h0Var);
        hVar.d("Bitmap", Bitmap.class, Bitmap.class, new a0(0));
        hVar.c(Bitmap.class, bVar5);
        hVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new d4.a(resources, eVar));
        hVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new d4.a(resources, aVar));
        hVar.d("BitmapDrawable", cls, BitmapDrawable.class, new d4.a(resources, d0Var));
        hVar.c(BitmapDrawable.class, new aa.c(14, aVar2, bVar5));
        hVar.d("Animation", InputStream.class, h4.c.class, new h4.i(arrayListE, aVar3, fVar));
        hVar.d("Animation", ByteBuffer.class, h4.c.class, aVar3);
        hVar.c(h4.c.class, new b9.e(17));
        hVar.a(t3.d.class, t3.d.class, h0Var);
        hVar.d("Bitmap", t3.d.class, Bitmap.class, new d4.e(aVar2, 2));
        hVar.d("legacy_append", Uri.class, Drawable.class, eVar3);
        hVar.d("legacy_append", Uri.class, Bitmap.class, new d4.a(1, eVar3, aVar2));
        hVar.h(new com.bumptech.glide.load.data.h(2));
        hVar.a(File.class, ByteBuffer.class, new h0(6));
        hVar.a(File.class, InputStream.class, new m(new h0(9)));
        hVar.d("legacy_append", File.class, File.class, new a0(2));
        hVar.a(File.class, cls, new m(new h0(8)));
        hVar.a(File.class, File.class, h0Var);
        hVar.h(new com.bumptech.glide.load.data.m(fVar));
        if (!"robolectric".equals(str)) {
            hVar.h(new com.bumptech.glide.load.data.h(1));
        }
        a4.i iVar = new a4.i(applicationContext, 0, false);
        g gVar = new g(applicationContext);
        a4.h hVar2 = new a4.h(applicationContext, 0);
        Class cls3 = Integer.TYPE;
        hVar.a(cls3, InputStream.class, iVar);
        hVar.a(Integer.class, InputStream.class, iVar);
        hVar.a(cls3, AssetFileDescriptor.class, gVar);
        hVar.a(Integer.class, AssetFileDescriptor.class, gVar);
        hVar.a(cls3, Drawable.class, hVar2);
        hVar.a(Integer.class, Drawable.class, hVar2);
        int i10 = 1;
        hVar.a(Uri.class, InputStream.class, new a4.i(applicationContext, i10, false));
        hVar.a(Uri.class, AssetFileDescriptor.class, new a4.h(applicationContext, 1));
        a4.f0 f0Var = new a4.f0(resources);
        a4.b bVar6 = new a4.b(resources, i10);
        e7.i iVar2 = new e7.i(resources, 3);
        hVar.a(Integer.class, Uri.class, f0Var);
        hVar.a(cls3, Uri.class, f0Var);
        hVar.a(Integer.class, AssetFileDescriptor.class, bVar6);
        hVar.a(cls3, AssetFileDescriptor.class, bVar6);
        hVar.a(Integer.class, InputStream.class, iVar2);
        hVar.a(cls3, InputStream.class, iVar2);
        hVar.a(String.class, InputStream.class, new e7.i(1));
        hVar.a(Uri.class, InputStream.class, new e7.i(1));
        hVar.a(String.class, InputStream.class, new h0(13));
        hVar.a(String.class, cls, new h0(12));
        hVar.a(String.class, AssetFileDescriptor.class, new h0(11));
        hVar.a(Uri.class, InputStream.class, new a4.b(applicationContext.getAssets(), 0));
        hVar.a(Uri.class, AssetFileDescriptor.class, new a5.b(applicationContext.getAssets(), 1));
        hVar.a(Uri.class, InputStream.class, new a4.h(applicationContext, 2));
        hVar.a(Uri.class, InputStream.class, new a4.i(applicationContext, 3, false));
        if (i >= 29) {
            hVar.a(Uri.class, InputStream.class, new b4.b(applicationContext, cls2));
            hVar.a(Uri.class, cls, new b4.b(applicationContext, cls));
        }
        int i11 = 2;
        hVar.a(Uri.class, InputStream.class, new a4.b(contentResolver, i11));
        hVar.a(Uri.class, cls, new a5.b(contentResolver, i11));
        hVar.a(Uri.class, AssetFileDescriptor.class, new ib.c(contentResolver, i11));
        hVar.a(Uri.class, InputStream.class, new h0(14));
        hVar.a(URL.class, InputStream.class, new wa.d());
        hVar.a(Uri.class, File.class, new e7.i(applicationContext, 2));
        hVar.a(n.class, InputStream.class, new ib.c(7));
        hVar.a(byte[].class, ByteBuffer.class, new h0(2));
        hVar.a(byte[].class, InputStream.class, new h0(4));
        hVar.a(Uri.class, Uri.class, h0Var);
        hVar.a(Drawable.class, Drawable.class, h0Var);
        hVar.d("legacy_append", Drawable.class, Drawable.class, new a0(1));
        hVar.i(Bitmap.class, BitmapDrawable.class, new a4.f0(resources));
        hVar.i(Bitmap.class, byte[].class, jVar);
        hVar.i(Drawable.class, byte[].class, new a2.l(aVar2, jVar, dVar, 20));
        hVar.i(h4.c.class, byte[].class, dVar);
        d0 d0Var2 = new d0(aVar2, new wa.d());
        hVar.d("legacy_append", ByteBuffer.class, Bitmap.class, d0Var2);
        hVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new d4.a(resources, d0Var2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[EDGE_INSN: B:45:0x0092->B:41:0x0092 BREAK  A[LOOP:0: B:11:0x001a->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0073 A[SYNTHETIC] */
    public static final List j(q3.e eVar, int i, int i10) {
        TreeMap treeMap;
        ub.f fVar;
        Iterator it;
        boolean z4;
        int iIntValue;
        TreeMap treeMap2;
        i.e(eVar, "<this>");
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f7990a;
        if (i == i10) {
            return q.f9297a;
        }
        boolean z10 = i10 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z10) {
                if (i <= i10) {
                    return arrayList;
                }
                if (z10) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        fVar = null;
                    } else {
                        fVar = new ub.f(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        fVar = null;
                    } else {
                        fVar = new ub.f(treeMap, treeMap.keySet());
                    }
                }
                if (fVar == null) {
                    Map map = (Map) fVar.f9065a;
                    it = ((Iterable) fVar.f9066b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z4 = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z10) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i10 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i10) {
                    return arrayList;
                }
                if (z10) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        fVar = null;
                    } else {
                        fVar = new ub.f(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        fVar = null;
                    } else {
                        fVar = new ub.f(treeMap, treeMap.keySet());
                    }
                }
                if (fVar == null) {
                    Map map2 = (Map) fVar.f9065a;
                    it = ((Iterable) fVar.f9066b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z4 = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z10) {
                            if (i10 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                i.b(obj);
                                arrayList.add(obj);
                                z4 = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i10) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            i.b(obj2);
                            arrayList.add(obj2);
                            z4 = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z4);
        return null;
    }

    public static bd.k k(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = q.f9297a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        bd.g gVarC = bd.g.f1577b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        b0 b0VarO = c.o(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? cd.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = cd.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new bd.k(b0VarO, gVarC, listK2, new j0(listK, 2));
    }

    public static Drawable l(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f7787a) {
                return o(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return e0.k.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f7787a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = g0.n.f4149a;
        return g0.i.a(resources, i, theme);
    }

    public static final boolean m(y1.a aVar, int i, int i10) {
        i.e(aVar, "<this>");
        if (i > i10 && aVar.f10402l) {
            return false;
        }
        Set set = aVar.f10403m;
        return aVar.f10401k && (set == null || !set.contains(Integer.valueOf(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ub.g] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static List n() {
        ?? M;
        String str = "getString(...)";
        try {
            SharedPreferences sharedPreferences = p.f5195a;
            if (sharedPreferences == null) {
                throw new IllegalStateException("Prefs.init(context) no llamado");
            }
            String str2 = "";
            String string = sharedPreferences.getString("proxy_profiles", "");
            if (string != null) {
                str2 = string;
            }
            JSONArray jSONArray = new JSONArray(str2);
            mc.e eVarL = jd.d.L(0, jSONArray.length());
            M = new ArrayList(vb.k.U(eVarL));
            Iterator it = eVarL.iterator();
            while (((mc.b) it).f7105d) {
                JSONObject jSONObject = jSONArray.getJSONObject(((mc.b) it).nextInt());
                long j4 = jSONObject.getLong("id");
                String string2 = jSONObject.getString("name");
                i.d(string2, str);
                String strOptString = jSONObject.optString("url");
                i.d(strOptString, "optString(...)");
                int iOptInt = jSONObject.optInt("t");
                String string3 = jSONObject.getString("h");
                i.d(string3, str);
                int i = jSONObject.getInt("p");
                String strOptString2 = jSONObject.optString("u");
                i.d(strOptString2, "optString(...)");
                String strOptString3 = jSONObject.optString("w");
                i.d(strOptString3, "optString(...)");
                String strOptString4 = jSONObject.optString("c");
                String str3 = strOptString4.length() == 0 ? null : strOptString4;
                String strOptString5 = jSONObject.optString("ip");
                M.add(new n3.b(j4, string2, strOptString, iOptInt, string3, i, strOptString2, strOptString3, str3, strOptString5.length() == 0 ? null : strOptString5, jSONObject.optBoolean("v", false)));
                str = str;
            }
            boolean z4 = M instanceof ub.g;
            ?? r10 = M;
            if (z4) {
                r10 = q.f9297a;
            }
            return (List) r10;
        } catch (Throwable th) {
            M = r7.g.m(th);
        }
    }

    public static Drawable o(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            j.d dVar = new j.d(context);
            dVar.f5585b = theme;
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return d.r(context, i);
    }

    public static void p(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        b.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void q(ArrayList arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n3.b bVar = (n3.b) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", bVar.f7238a);
            jSONObject.put("name", bVar.f7239b);
            jSONObject.put("url", bVar.f7240c);
            jSONObject.put("t", bVar.f7241d);
            jSONObject.put("h", bVar.e);
            jSONObject.put("p", bVar.f7242f);
            jSONObject.put("u", bVar.f7243g);
            jSONObject.put("w", bVar.h);
            String str = bVar.i;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("c", str);
            String str3 = bVar.f7244j;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("ip", str2);
            jSONObject.put("v", bVar.f7245k);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        i.d(string, "toString(...)");
        SharedPreferences sharedPreferences = p.f5195a;
        if (sharedPreferences == null) {
            throw new IllegalStateException("Prefs.init(context) no llamado");
        }
        sharedPreferences.edit().putString("proxy_profiles", string).apply();
    }

    public static void r(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = v0.f7946a;
        boolean zA = c0.a(checkableImageButton);
        boolean z4 = onLongClickListener != null;
        boolean z10 = zA || z4;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z4);
        q0.d0.s(checkableImageButton, z10 ? 1 : 2);
    }

    public static void s(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j3.a(view, charSequence);
            return;
        }
        l3 l3Var = l3.f6342v;
        if (l3Var != null && l3Var.f6344a == view) {
            l3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l3(view, charSequence);
            return;
        }
        l3 l3Var2 = l3.f6343w;
        if (l3Var2 != null && l3Var2.f6344a == view) {
            l3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final Object t(wc.s sVar, wc.s sVar2, ic.p pVar) {
        Object sVar3;
        Object objL;
        try {
            t.a(2, pVar);
            sVar3 = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            sVar3 = new rc.s(false, th);
        }
        zb.a aVar = zb.a.f11555a;
        if (sVar3 == aVar || (objL = sVar.L(sVar3)) == rc.b0.e) {
            return aVar;
        }
        if (objL instanceof rc.s) {
            throw ((rc.s) objL).f8315a;
        }
        return rc.b0.w(objL);
    }

    public static final void u(View view, ic.l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type T of com.ismaeldivita.chipnavigation.util.ViewGroupKt.updateLayoutParams");
        }
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static boolean v(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !v((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!i0.m(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static Bundle w(Context context, String str) {
        JSONArray jSONArray;
        int i;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                i6.h.c("JSON parsing error", e);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i = 1;
            } else if (iOptInt != 1) {
                i = iOptInt != 2 ? 0 : 3;
            } else {
                i = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i != 0) {
                List listZze = zzfxd.zzb(zzfwf.zzc('/')).zze(strOptString2);
                if (listZze.size() > 2 || listZze.isEmpty()) {
                    obj = null;
                } else {
                    if (listZze.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listZze.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listZze.get(0), 0);
                        str2 = (String) listZze.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i11 = i - 1;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void x(Context context) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzgc)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzftl zzftlVarZzj = zzftl.zzj(context);
            zzftm zzftmVarZzi = zzftm.zzi(context);
            zzftn zzftnVarZza = zzftn.zza(context);
            zzftlVarZzj.zzk();
            zzftlVarZzj.zzl();
            zzftmVarZzi.zzj();
            zzftnVarZza.zzb(null);
        } catch (IOException e) {
            d6.p.C.f2982g.zzw(e, "clearStorageOnIdlessMode");
        }
    }
}
