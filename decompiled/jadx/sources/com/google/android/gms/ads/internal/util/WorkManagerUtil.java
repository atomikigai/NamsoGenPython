package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import h6.z;
import i6.h;
import java.util.HashMap;
import java.util.HashSet;
import q5.d;
import q7.a;
import q7.b;
import r7.i;
import t2.c;
import t2.e;
import t2.f;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends zzayd implements z {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i == 1) {
            a aVarY = b.y(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzaye.zzc(parcel);
            boolean zZzf = zzf(aVarY, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i == 2) {
            a aVarY2 = b.y(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zze(aVarY2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            a aVarY3 = b.y(parcel.readStrongBinder());
            f6.a aVar = (f6.a) zzaye.zza(parcel, f6.a.CREATOR);
            zzaye.zzc(parcel);
            boolean zZzg = zzg(aVarY3, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }

    @Override // h6.z
    public final void zze(a aVar) {
        Context context = (Context) b.I(aVar);
        try {
            j.T(context.getApplicationContext(), new t2.b(new i()));
        } catch (IllegalStateException unused) {
        }
        try {
            j jVarS = j.S(context);
            jVarS.f8822p.m(new d3.b(jVarS, 0));
            e eVar = new e();
            c cVar = new c();
            cVar.f8532a = 1;
            cVar.f8536f = -1L;
            cVar.f8537g = -1L;
            new HashSet();
            cVar.f8533b = false;
            cVar.f8534c = false;
            cVar.f8532a = 2;
            cVar.f8535d = false;
            cVar.e = false;
            cVar.h = eVar;
            cVar.f8536f = -1L;
            cVar.f8537g = -1L;
            d dVar = new d(OfflinePingSender.class);
            ((c3.i) dVar.f8040b).f1750j = cVar;
            ((HashSet) dVar.f8041c).add("offline_ping_sender_work");
            jVarS.k(dVar.f());
        } catch (IllegalStateException e) {
            h.h("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // h6.z
    public final boolean zzf(a aVar, String str, String str2) {
        return zzg(aVar, new f6.a(str, str2, ""));
    }

    @Override // h6.z
    public final boolean zzg(a aVar, f6.a aVar2) throws Throwable {
        Context context = (Context) b.I(aVar);
        try {
            j.T(context.getApplicationContext(), new t2.b(new i()));
        } catch (IllegalStateException unused) {
        }
        e eVar = new e();
        c cVar = new c();
        cVar.f8532a = 1;
        cVar.f8536f = -1L;
        cVar.f8537g = -1L;
        new HashSet();
        cVar.f8533b = false;
        cVar.f8534c = false;
        cVar.f8532a = 2;
        cVar.f8535d = false;
        cVar.e = false;
        cVar.h = eVar;
        cVar.f8536f = -1L;
        cVar.f8537g = -1L;
        HashMap map = new HashMap();
        map.put("uri", aVar2.f3611a);
        map.put("gws_query_id", aVar2.f3612b);
        map.put("image_url", aVar2.f3613c);
        f fVar = new f(map);
        f.c(fVar);
        d dVar = new d(OfflineNotificationPoster.class);
        c3.i iVar = (c3.i) dVar.f8040b;
        iVar.f1750j = cVar;
        iVar.e = fVar;
        ((HashSet) dVar.f8041c).add("offline_notification_work");
        try {
            j.S(context).k(dVar.f());
            return true;
        } catch (IllegalStateException e) {
            h.h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
