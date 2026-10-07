package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcwz;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdgk;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzeea;
import d6.i;
import d6.p;
import e6.r3;
import e6.t;
import g6.c;
import g6.e;
import g6.j;
import g6.k;
import g6.l;
import h7.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new r3(8);
    public static final AtomicLong J = new AtomicLong(0);
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public final zzbih A;
    public final String B;
    public final String C;
    public final String D;
    public final zzcwz E;
    public final zzdel F;
    public final zzbsz G;
    public final boolean H;
    public final long I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e6.a f1964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f1965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzcfk f1966d;
    public final zzbij e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1967f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f1970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f1973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i6.a f1974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f1975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i f1976z;

    public AdOverlayInfoParcel(zzcfk zzcfkVar, i6.a aVar, String str, String str2, zzbsz zzbszVar) {
        this.f1963a = null;
        this.f1964b = null;
        this.f1965c = null;
        this.f1966d = zzcfkVar;
        this.A = null;
        this.e = null;
        this.f1967f = null;
        this.f1968r = false;
        this.f1969s = null;
        this.f1970t = null;
        this.f1971u = 14;
        this.f1972v = 5;
        this.f1973w = null;
        this.f1974x = aVar;
        this.f1975y = null;
        this.f1976z = null;
        this.B = str;
        this.C = str2;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = zzbszVar;
        this.H = false;
        this.I = J.getAndIncrement();
    }

    public static AdOverlayInfoParcel g(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmC)).booleanValue()) {
                return null;
            }
            p.C.f2982g.zzw(e, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    public static final IBinder h(Object obj) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmC)).booleanValue()) {
            return null;
        }
        return new b(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.J(parcel, 2, this.f1963a, i, false);
        d.F(parcel, 3, h(this.f1964b));
        d.F(parcel, 4, h(this.f1965c));
        d.F(parcel, 5, h(this.f1966d));
        d.F(parcel, 6, h(this.e));
        d.K(parcel, 7, this.f1967f, false);
        d.R(parcel, 8, 4);
        parcel.writeInt(this.f1968r ? 1 : 0);
        d.K(parcel, 9, this.f1969s, false);
        d.F(parcel, 10, h(this.f1970t));
        d.R(parcel, 11, 4);
        parcel.writeInt(this.f1971u);
        d.R(parcel, 12, 4);
        parcel.writeInt(this.f1972v);
        d.K(parcel, 13, this.f1973w, false);
        d.J(parcel, 14, this.f1974x, i, false);
        d.K(parcel, 16, this.f1975y, false);
        d.J(parcel, 17, this.f1976z, i, false);
        d.F(parcel, 18, h(this.A));
        d.K(parcel, 19, this.B, false);
        d.K(parcel, 24, this.C, false);
        d.K(parcel, 25, this.D, false);
        d.F(parcel, 26, h(this.E));
        d.F(parcel, 27, h(this.F));
        d.F(parcel, 28, h(this.G));
        d.R(parcel, 29, 4);
        parcel.writeInt(this.H ? 1 : 0);
        d.R(parcel, 30, 8);
        long j4 = this.I;
        parcel.writeLong(j4);
        d.Q(iP, parcel);
        zzbce zzbceVar = zzbcn.zzmC;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            K.put(Long.valueOf(j4), new j(this.f1964b, this.f1965c, this.f1966d, this.A, this.e, this.f1970t, this.E, this.F, this.G, zzcaj.zzd.schedule(new k(j4), ((Integer) tVar.f3440c.zza(zzbcn.zzmE)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(zzdgk zzdgkVar, zzcfk zzcfkVar, int i, i6.a aVar, String str, i iVar, String str2, String str3, String str4, zzcwz zzcwzVar, zzeea zzeeaVar) {
        this.f1963a = null;
        this.f1964b = null;
        this.f1965c = zzdgkVar;
        this.f1966d = zzcfkVar;
        this.A = null;
        this.e = null;
        this.f1968r = false;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaQ)).booleanValue()) {
            this.f1967f = null;
            this.f1969s = null;
        } else {
            this.f1967f = str2;
            this.f1969s = str3;
        }
        this.f1970t = null;
        this.f1971u = i;
        this.f1972v = 1;
        this.f1973w = null;
        this.f1974x = aVar;
        this.f1975y = str;
        this.f1976z = iVar;
        this.B = null;
        this.C = null;
        this.D = str4;
        this.E = zzcwzVar;
        this.F = null;
        this.G = zzeeaVar;
        this.H = false;
        this.I = J.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzdvv zzdvvVar, zzcfk zzcfkVar, i6.a aVar) {
        this.f1965c = zzdvvVar;
        this.f1966d = zzcfkVar;
        this.f1971u = 1;
        this.f1974x = aVar;
        this.f1963a = null;
        this.f1964b = null;
        this.A = null;
        this.e = null;
        this.f1967f = null;
        this.f1968r = false;
        this.f1969s = null;
        this.f1970t = null;
        this.f1972v = 1;
        this.f1973w = null;
        this.f1975y = null;
        this.f1976z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = false;
        this.I = J.getAndIncrement();
    }

    public AdOverlayInfoParcel(e6.a aVar, l lVar, zzbih zzbihVar, zzbij zzbijVar, c cVar, zzcfk zzcfkVar, boolean z4, int i, String str, i6.a aVar2, zzdel zzdelVar, zzeea zzeeaVar, boolean z10) {
        this.f1963a = null;
        this.f1964b = aVar;
        this.f1965c = lVar;
        this.f1966d = zzcfkVar;
        this.A = zzbihVar;
        this.e = zzbijVar;
        this.f1967f = null;
        this.f1968r = z4;
        this.f1969s = null;
        this.f1970t = cVar;
        this.f1971u = i;
        this.f1972v = 3;
        this.f1973w = str;
        this.f1974x = aVar2;
        this.f1975y = null;
        this.f1976z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdelVar;
        this.G = zzeeaVar;
        this.H = z10;
        this.I = J.getAndIncrement();
    }

    public AdOverlayInfoParcel(e6.a aVar, l lVar, zzbih zzbihVar, zzbij zzbijVar, c cVar, zzcfk zzcfkVar, boolean z4, int i, String str, String str2, i6.a aVar2, zzdel zzdelVar, zzeea zzeeaVar) {
        this.f1963a = null;
        this.f1964b = aVar;
        this.f1965c = lVar;
        this.f1966d = zzcfkVar;
        this.A = zzbihVar;
        this.e = zzbijVar;
        this.f1967f = str2;
        this.f1968r = z4;
        this.f1969s = str;
        this.f1970t = cVar;
        this.f1971u = i;
        this.f1972v = 3;
        this.f1973w = null;
        this.f1974x = aVar2;
        this.f1975y = null;
        this.f1976z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdelVar;
        this.G = zzeeaVar;
        this.H = false;
        this.I = J.getAndIncrement();
    }

    public AdOverlayInfoParcel(e6.a aVar, l lVar, c cVar, zzcfk zzcfkVar, boolean z4, int i, i6.a aVar2, zzdel zzdelVar, zzeea zzeeaVar) {
        this.f1963a = null;
        this.f1964b = aVar;
        this.f1965c = lVar;
        this.f1966d = zzcfkVar;
        this.A = null;
        this.e = null;
        this.f1967f = null;
        this.f1968r = z4;
        this.f1969s = null;
        this.f1970t = cVar;
        this.f1971u = i;
        this.f1972v = 2;
        this.f1973w = null;
        this.f1974x = aVar2;
        this.f1975y = null;
        this.f1976z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdelVar;
        this.G = zzeeaVar;
        this.H = false;
        this.I = J.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z4, String str2, IBinder iBinder5, int i, int i10, String str3, i6.a aVar, String str4, i iVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10, long j4) {
        this.f1963a = eVar;
        this.f1967f = str;
        this.f1968r = z4;
        this.f1969s = str2;
        this.f1971u = i;
        this.f1972v = i10;
        this.f1973w = str3;
        this.f1974x = aVar;
        this.f1975y = str4;
        this.f1976z = iVar;
        this.B = str5;
        this.C = str6;
        this.D = str7;
        this.H = z10;
        this.I = j4;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmC)).booleanValue()) {
            j jVar = (j) K.remove(Long.valueOf(j4));
            if (jVar != null) {
                this.f1964b = jVar.f4210a;
                this.f1965c = jVar.f4211b;
                this.f1966d = jVar.f4212c;
                this.A = jVar.f4213d;
                this.e = jVar.e;
                this.E = jVar.f4215g;
                this.F = jVar.h;
                this.G = jVar.i;
                this.f1970t = jVar.f4214f;
                jVar.f4216j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f1964b = (e6.a) b.I(b.y(iBinder));
        this.f1965c = (l) b.I(b.y(iBinder2));
        this.f1966d = (zzcfk) b.I(b.y(iBinder3));
        this.A = (zzbih) b.I(b.y(iBinder6));
        this.e = (zzbij) b.I(b.y(iBinder4));
        this.f1970t = (c) b.I(b.y(iBinder5));
        this.E = (zzcwz) b.I(b.y(iBinder7));
        this.F = (zzdel) b.I(b.y(iBinder8));
        this.G = (zzbsz) b.I(b.y(iBinder9));
    }

    public AdOverlayInfoParcel(e eVar, e6.a aVar, l lVar, c cVar, i6.a aVar2, zzcfk zzcfkVar, zzdel zzdelVar) {
        this.f1963a = eVar;
        this.f1964b = aVar;
        this.f1965c = lVar;
        this.f1966d = zzcfkVar;
        this.A = null;
        this.e = null;
        this.f1967f = null;
        this.f1968r = false;
        this.f1969s = null;
        this.f1970t = cVar;
        this.f1971u = -1;
        this.f1972v = 4;
        this.f1973w = null;
        this.f1974x = aVar2;
        this.f1975y = null;
        this.f1976z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = zzdelVar;
        this.G = null;
        this.H = false;
        this.I = J.getAndIncrement();
    }
}
