package b9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.material.tabs.TabLayout;
import d4.c0;
import h6.k0;
import h6.o0;
import h6.r0;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.x;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class e implements s0, com.bumptech.glide.manager.h, com.bumptech.glide.manager.n, com.google.android.gms.common.api.internal.v, c0, ea.a, u3.l, h2.d, x, l6.c, la.a, q4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f1438b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1439a;

    public /* synthetic */ e(int i) {
        this.f1439a = i;
    }

    public static final boolean A(Context context, g6.e eVar, g6.c cVar, g6.a aVar) {
        int i = 0;
        if (eVar == null) {
            i6.h.g("No intent data for launcher overlay.");
            return false;
        }
        String str = eVar.f4186d;
        String str2 = eVar.f4185c;
        boolean z4 = eVar.f4191u;
        String str3 = eVar.e;
        String str4 = eVar.f4184b;
        zzbcn.zza(context);
        Intent intent = eVar.f4189s;
        if (intent != null) {
            return z(context, intent, cVar, aVar, z4);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(str4)) {
            i6.h.g("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            intent2.setData(Uri.parse(str4));
        } else {
            intent2.setDataAndType(Uri.parse(str4), str2);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent2.setPackage(str);
        }
        if (!TextUtils.isEmpty(str3)) {
            String[] strArrSplit = str3.split("/", 2);
            if (strArrSplit.length < 2) {
                i6.h.g("Could not parse component name from open GMSG: ".concat(String.valueOf(str3)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str5 = eVar.f4187f;
        if (!TextUtils.isEmpty(str5)) {
            try {
                i = Integer.parseInt(str5);
            } catch (NumberFormatException unused) {
                i6.h.g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        zzbce zzbceVar = zzbcn.zzeC;
        e6.t tVar = e6.t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzeB)).booleanValue()) {
                r0 r0Var = d6.p.C.f2979c;
                r0.D(context, intent2);
            }
        }
        return z(context, intent2, cVar, aVar, z4);
    }

    public static final String q(byte[] bArr, byte[][] bArr2, int i) {
        int i10;
        boolean z4;
        int i11;
        int i12;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (bArr[i10] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i;
            boolean z10 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z10) {
                    i11 = 46;
                    z4 = false;
                } else {
                    byte b10 = bArr2[i18][i19];
                    byte[] bArr4 = cd.b.f1822a;
                    int i21 = b10 & 255;
                    z4 = z10;
                    i11 = i21;
                }
                byte b11 = bArr[i15 + i20];
                byte[] bArr5 = cd.b.f1822a;
                i12 = i11 - (b11 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (bArr2[i18].length != i19) {
                    z10 = z4;
                } else {
                    if (i18 == bArr2.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z10 = true;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i22 = i17 - i20;
                    int length2 = bArr2[i18].length - i19;
                    int length3 = bArr2.length;
                    for (int i23 = i18 + 1; i23 < length3; i23++) {
                        length2 += bArr2[i23].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            Charset charset = StandardCharsets.UTF_8;
                            jc.i.d(charset, "UTF_8");
                            return new String(bArr, i15, i17, charset);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            length = i14;
        }
        return null;
    }

    public static RectF r(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.P || !(view instanceof f9.i)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        f9.i iVar = (f9.i) view;
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int iD = (int) u8.n.d(iVar.getContext(), 24);
        if (contentWidth < iD) {
            contentWidth = iD;
        }
        int right = (iVar.getRight() + iVar.getLeft()) / 2;
        int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static ArrayList s(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new q3.f((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static final void y(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z4) {
        if (adOverlayInfoParcel.f1972v != 4 || adOverlayInfoParcel.f1965c != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f1974x.f5216d);
            intent.putExtra("shouldCallOnOverlayOpened", z4);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            r0 r0Var = d6.p.C.f2979c;
            r0.p(context, intent);
            return;
        }
        e6.a aVar = adOverlayInfoParcel.f1964b;
        if (aVar != null) {
            aVar.onAdClicked();
        }
        zzdel zzdelVar = adOverlayInfoParcel.F;
        if (zzdelVar != null) {
            zzdelVar.zzdG();
        }
        Activity activityZzi = adOverlayInfoParcel.f1966d.zzi();
        g6.e eVar = adOverlayInfoParcel.f1963a;
        if (eVar != null && eVar.f4191u && activityZzi != null) {
            context = activityZzi;
        }
        e eVar2 = d6.p.C.f2977a;
        A(context, eVar, adOverlayInfoParcel.f1970t, eVar != null ? eVar.f4190t : null);
    }

    public static final boolean z(Context context, Intent intent, g6.c cVar, g6.a aVar, boolean z4) {
        int iB;
        if (z4) {
            Uri data = intent.getData();
            try {
                d6.p.C.f2979c.getClass();
                iB = r0.B(context, data);
                if (cVar != null) {
                    cVar.zzg();
                }
            } catch (ActivityNotFoundException e) {
                i6.h.g(e.getMessage());
                iB = 6;
            }
            if (aVar != null) {
                aVar.zzb(iB);
            }
            return iB == 5;
        }
        try {
            k0.k("Launching an intent: " + intent.toURI());
            r0 r0Var = d6.p.C.f2979c;
            r0.p(context, intent);
            if (cVar != null) {
                cVar.zzg();
            }
            if (aVar != null) {
                aVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e4) {
            i6.h.g(e4.getMessage());
            if (aVar != null) {
                aVar.zza(false);
            }
            return false;
        }
    }

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) {
        switch (this.f1439a) {
            case 4:
                return new androidx.fragment.app.k0(true);
            default:
                return new m1.b();
        }
    }

    @Override // ea.a
    public String e() {
        return null;
    }

    @Override // u3.l
    public int f(u3.i iVar) {
        return 1;
    }

    @Override // q4.a
    public Object g() {
        return new ArrayList();
    }

    @Override // k.x
    public boolean h(k.l lVar) {
        return false;
    }

    @Override // com.bumptech.glide.manager.h
    public void i(com.bumptech.glide.manager.i iVar) {
        iVar.j();
    }

    @Override // la.a
    public StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // d4.c0
    public void m(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f1439a) {
            case 10:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // h2.d
    public h2.e n(com.bumptech.glide.manager.q qVar) {
        return new i2.i((Context) qVar.f1933b, (String) qVar.f1934c, (h2.c) qVar.f1935d, qVar.f1932a);
    }

    @Override // d4.c0
    public void o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f1439a) {
            case 10:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // u3.c
    public boolean p(Object obj, File file, u3.i iVar) throws Throwable {
        try {
            p4.b.d(((h4.g) ((h4.c) ((w3.x) obj).get()).f4934a.f4933b).f4950a.f8582d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    public r3.a t(q3.k kVar, Map map) throws Throwable {
        int i = kVar.f8006b;
        String str = kVar.f8007c;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(Collections.EMPTY_MAP);
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i10 = kVar.f8015w.f7938a;
        httpURLConnection.setConnectTimeout(i10);
        httpURLConnection.setReadTimeout(i10);
        boolean z4 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        ProxyConfig.MATCH_HTTPS.equals(url.getProtocol());
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (i == 0) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (i != 1) {
                    throw new IllegalStateException("Unknown method type.");
                }
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrE = kVar.e();
                if (bArrE != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", kVar.f());
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrE);
                    dataOutputStream.close();
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (i == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                r3.a aVar = new r3.a(responseCode, s(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return aVar;
            }
            try {
                return new r3.a(responseCode, s(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new r3.d(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z4 = true;
                if (!z4) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Signature[] u(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean v(CharSequence charSequence) {
        return charSequence instanceof o0.e;
    }

    public void w(o0 o0Var, float f10) {
        q.a aVar = (q.a) ((Drawable) o0Var.f5061b);
        CardView cardView = (CardView) o0Var.f5062c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != aVar.e || aVar.f7872f != useCompatPadding || aVar.f7873g != preventCornerOverlap) {
            aVar.e = f10;
            aVar.f7872f = useCompatPadding;
            aVar.f7873g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            o0Var.p(0, 0, 0, 0);
            return;
        }
        q.a aVar2 = (q.a) ((Drawable) o0Var.f5061b);
        float f11 = aVar2.e;
        float f12 = aVar2.f7868a;
        int iCeil = (int) Math.ceil(q.b.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(q.b.b(f11, f12, cardView.getPreventCornerOverlap()));
        o0Var.p(iCeil, iCeil2, iCeil, iCeil2);
    }

    public void x(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFR = r(tabLayout, view);
        RectF rectFR2 = r(tabLayout, view2);
        drawable.setBounds(e8.a.c(f10, (int) rectFR.left, (int) rectFR2.left), drawable.getBounds().top, e8.a.c(f10, (int) rectFR.right, (int) rectFR2.right), drawable.getBounds().bottom);
    }

    @Override // ea.a
    public void c() {
    }

    @Override // com.bumptech.glide.manager.h
    public void k(com.bumptech.glide.manager.i iVar) {
    }

    @Override // k.x
    public void b(k.l lVar, boolean z4) {
    }

    @Override // ea.a
    public void l(String str, long j4) {
    }
}
