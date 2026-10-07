package d6;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import bd.v;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzcaj;
import e6.c0;
import e6.c1;
import e6.e1;
import e6.f2;
import e6.j2;
import e6.l0;
import e6.l3;
import e6.m2;
import e6.o3;
import e6.q0;
import e6.q3;
import e6.u3;
import e6.w;
import e6.y1;
import e6.z;
import e6.z0;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6.a f2969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3 f2970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9.a f2971c = zzcaj.zza.zzb(new m(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2972d;
    public final v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f2973f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f2974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzavc f2975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AsyncTask f2976t;

    public o(Context context, q3 q3Var, String str, i6.a aVar) {
        this.f2972d = context;
        this.f2969a = aVar;
        this.f2970b = q3Var;
        this.f2973f = new WebView(context);
        this.e = new v(context, str);
        y(0);
        this.f2973f.setVerticalScrollBarEnabled(false);
        this.f2973f.getSettings().setJavaScriptEnabled(true);
        this.f2973f.setWebViewClient(new k(this, 0));
        this.f2973f.setOnTouchListener(new l(this, 0));
    }

    public final void y(int i) {
        if (this.f2973f == null) {
            return;
        }
        this.f2973f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // e6.m0
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzB() {
        i0.d("resume must be called on the main UI thread.");
    }

    @Override // e6.m0
    public final void zzC(w wVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzD(z zVar) {
        this.f2974r = zVar;
    }

    @Override // e6.m0
    public final void zzE(q0 q0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzF(q3 q3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // e6.m0
    public final void zzG(z0 z0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzH(zzbai zzbaiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzI(u3 u3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzK(m2 m2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzL(boolean z4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzM(zzbtp zzbtpVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzO(zzbdi zzbdiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzQ(zzbts zzbtsVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzS(zzbwp zzbwpVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzU(l3 l3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final boolean zzY() {
        return false;
    }

    @Override // e6.m0
    public final boolean zzZ() {
        return false;
    }

    @Override // e6.m0
    public final boolean zzaa() {
        return false;
    }

    @Override // e6.m0
    public final boolean zzab(o3 o3Var) {
        i0.j(this.f2973f, "This Search Ad has already been torn down");
        v vVar = this.e;
        TreeMap treeMap = (TreeMap) vVar.f1683d;
        vVar.e = o3Var.f3379u.f3331a;
        Bundle bundle = o3Var.f3382x;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbdz.zzc.zze();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    vVar.f1684f = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f2969a.f5213a);
            if (((Boolean) zzbdz.zza.zze()).booleanValue()) {
                Bundle bundleW = p3.a.w((Context) vVar.f1682c, (String) zzbdz.zzb.zze());
                for (String str3 : bundleW.keySet()) {
                    treeMap.put(str3, bundleW.get(str3).toString());
                }
            }
        }
        this.f2976t = new n(this).execute(new Void[0]);
        return true;
    }

    @Override // e6.m0
    public final void zzac(c1 c1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // e6.m0
    public final q3 zzg() {
        return this.f2970b;
    }

    @Override // e6.m0
    public final z zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // e6.m0
    public final z0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // e6.m0
    public final f2 zzk() {
        return null;
    }

    @Override // e6.m0
    public final j2 zzl() {
        return null;
    }

    @Override // e6.m0
    public final q7.a zzn() {
        i0.d("getAdFrame must be called on the main UI thread.");
        return new q7.b(this.f2973f);
    }

    public final String zzq() {
        String str = (String) this.e.f1684f;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return da.v.i("https://", str, (String) zzbdz.zzd.zze());
    }

    @Override // e6.m0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // e6.m0
    public final String zzs() {
        return null;
    }

    @Override // e6.m0
    public final String zzt() {
        return null;
    }

    @Override // e6.m0
    public final void zzx() {
        i0.d("destroy must be called on the main UI thread.");
        this.f2976t.cancel(true);
        this.f2971c.cancel(false);
        this.f2973f.destroy();
        this.f2973f = null;
    }

    @Override // e6.m0
    public final void zzz() {
        i0.d("pause must be called on the main UI thread.");
    }

    @Override // e6.m0
    public final void zzJ(e1 e1Var) {
    }

    @Override // e6.m0
    public final void zzN(boolean z4) {
    }

    @Override // e6.m0
    public final void zzP(y1 y1Var) {
    }

    @Override // e6.m0
    public final void zzW(q7.a aVar) {
    }

    @Override // e6.m0
    public final void zzy(o3 o3Var, c0 c0Var) {
    }
}
