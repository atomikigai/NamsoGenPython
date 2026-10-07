package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d6.j;
import g6.i;
import java.util.List;
import n7.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzcfk extends e6.a, zzdel, zzcfb, zzbmm, zzcgn, zzcgr, zzbmy, zzaym, zzcgu, j, zzcgx, zzcgy, zzccf, zzcgz {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i10);

    @Override // e6.a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzccf
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzccf
    void zzC(zzcgm zzcgmVar);

    @Override // com.google.android.gms.internal.ads.zzcfb
    zzfet zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgz
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgx
    zzavc zzI();

    zzazz zzJ();

    zzbfm zzK();

    i zzL();

    i zzM();

    zzchc zzN();

    @Override // com.google.android.gms.internal.ads.zzcgw
    zzche zzO();

    zzeeu zzP();

    zzeew zzQ();

    @Override // com.google.android.gms.internal.ads.zzcgn
    zzfew zzR();

    zzffs zzS();

    m9.a zzT();

    String zzU();

    List zzV();

    void zzW(zzfet zzfetVar, zzfew zzfewVar);

    void zzX();

    void zzY();

    void zzZ(int i);

    void zzaA(String str, e eVar);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z4, int i);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z4);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbjr zzbjrVar);

    void zzah();

    void zzai(i iVar);

    void zzaj(zzche zzcheVar);

    void zzak(zzazz zzazzVar);

    void zzal(boolean z4);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z4);

    void zzap(zzbfk zzbfkVar);

    void zzaq(boolean z4);

    void zzar(zzbfm zzbfmVar);

    void zzas(zzeeu zzeeuVar);

    void zzat(zzeew zzeewVar);

    void zzau(int i);

    void zzav(boolean z4);

    void zzaw(i iVar);

    void zzax(boolean z4);

    void zzay(boolean z4);

    void zzaz(String str, zzbjr zzbjrVar);

    @Override // d6.j
    /* synthetic */ void zzdg();

    @Override // d6.j
    /* synthetic */ void zzdh();

    @Override // com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzccf
    d6.a zzj();

    @Override // com.google.android.gms.internal.ads.zzccf
    zzbda zzm();

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzccf
    i6.a zzn();

    @Override // com.google.android.gms.internal.ads.zzccf
    zzcgm zzq();

    @Override // com.google.android.gms.internal.ads.zzccf
    void zzt(String str, zzcdr zzcdrVar);
}
