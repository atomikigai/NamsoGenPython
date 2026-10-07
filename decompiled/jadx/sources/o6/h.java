package o6;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzgee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements zzgee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbtv f7618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f7620d;

    public /* synthetic */ h(i iVar, zzbtv zzbtvVar, boolean z4, int i) {
        this.f7617a = i;
        this.f7618b = zzbtvVar;
        this.f7619c = z4;
        this.f7620d = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        switch (this.f7617a) {
            case 0:
                try {
                    this.f7618b.zze("Internal error: " + th.getMessage());
                } catch (RemoteException e) {
                    i6.h.e("", e);
                    return;
                }
                break;
            default:
                try {
                    this.f7618b.zze("Internal error: " + th.getMessage());
                } catch (RemoteException e4) {
                    i6.h.e("", e4);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: RemoteException -> 0x0038, TryCatch #0 {RemoteException -> 0x0038, blocks: (B:5:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x0025, B:11:0x002a, B:13:0x0033, B:18:0x003a, B:19:0x003e, B:21:0x0044, B:23:0x0051, B:24:0x0061, B:26:0x0073), top: B:49:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x003e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        switch (this.f7617a) {
            case 0:
                i iVar = this.f7620d;
                zzflr zzflrVar = iVar.f7632w;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    this.f7618b.zzf(arrayList);
                    if (!iVar.f7633x && !this.f7619c) {
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        Uri uri = (Uri) obj2;
                        if (i.N(uri, iVar.J, iVar.K)) {
                            zzflrVar.zzc(i.O(uri, iVar.G, "1").toString(), null);
                        } else {
                            if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhh)).booleanValue()) {
                                zzflrVar.zzc(uri.toString(), null);
                            }
                        }
                    }
                } catch (RemoteException e) {
                    i6.h.e("", e);
                    return;
                }
                break;
            default:
                i iVar2 = this.f7620d;
                zzflr zzflrVar2 = iVar2.f7632w;
                ArrayList arrayList2 = iVar2.I;
                ArrayList arrayList3 = iVar2.H;
                List<Uri> list = (List) obj;
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (i.N((Uri) it.next(), arrayList3, arrayList2)) {
                            iVar2.D.getAndIncrement();
                            this.f7618b.zzf(list);
                            if (!iVar2.f7634y && !this.f7619c) {
                            }
                            for (Uri uri2 : list) {
                                if (i.N(uri2, arrayList3, arrayList2)) {
                                    zzflrVar2.zzc(i.O(uri2, iVar2.G, "1").toString(), null);
                                } else {
                                    if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhh)).booleanValue()) {
                                        zzflrVar2.zzc(uri2.toString(), null);
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    this.f7618b.zzf(list);
                    if (!iVar2.f7634y) {
                    }
                    while (r9.hasNext()) {
                        if (i.N(uri2, arrayList3, arrayList2)) {
                            zzflrVar2.zzc(i.O(uri2, iVar2.G, "1").toString(), null);
                        } else {
                            if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhh)).booleanValue()) {
                                zzflrVar2.zzc(uri2.toString(), null);
                            }
                        }
                        break;
                    }
                } catch (RemoteException e4) {
                    i6.h.e("", e4);
                }
                break;
        }
    }
}
