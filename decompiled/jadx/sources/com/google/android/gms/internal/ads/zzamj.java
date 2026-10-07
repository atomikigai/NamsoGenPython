package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamj implements zzanz {
    private final List zza;

    public zzamj(int i, List list) {
        this.zza = list;
    }

    private final zzanq zzc(zzany zzanyVar) {
        return new zzanq(zze(zzanyVar));
    }

    private final zzaod zzd(zzany zzanyVar) {
        return new zzaod(zze(zzanyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzany zzanyVar) {
        String str;
        int i;
        List listSingletonList;
        zzed zzedVar = new zzed(zzanyVar.zze);
        ArrayList arrayList = this.zza;
        while (zzedVar.zzb() > 0) {
            int iZzm = zzedVar.zzm();
            int iZzd = zzedVar.zzd() + zzedVar.zzm();
            if (iZzm == 134) {
                arrayList = new ArrayList();
                int iZzm2 = zzedVar.zzm() & 31;
                for (int i10 = 0; i10 < iZzm2; i10++) {
                    String strZzB = zzedVar.zzB(3, StandardCharsets.UTF_8);
                    int iZzm3 = zzedVar.zzm();
                    boolean z4 = (iZzm3 & 128) != 0;
                    if (z4) {
                        i = iZzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzm = (byte) zzedVar.zzm();
                    zzedVar.zzM(1);
                    if (z4) {
                        int i11 = bZzm & 64;
                        int i12 = zzdd.zza;
                        listSingletonList = Collections.singletonList(i11 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzab zzabVar = new zzab();
                    zzabVar.zzZ(str);
                    zzabVar.zzP(strZzB);
                    zzabVar.zzx(i);
                    zzabVar.zzM(listSingletonList);
                    arrayList.add(zzabVar.zzaf());
                }
            }
            zzedVar.zzL(iZzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final zzaob zzb(int i, zzany zzanyVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzang(new zzamy(zzanyVar.zzb, zzanyVar.zza()));
            }
            if (i == 21) {
                return new zzang(new zzamw());
            }
            if (i == 27) {
                return new zzang(new zzamt(zzc(zzanyVar), false, false));
            }
            if (i == 36) {
                return new zzang(new zzamv(zzc(zzanyVar)));
            }
            if (i == 45) {
                return new zzang(new zzamz());
            }
            if (i == 89) {
                return new zzang(new zzaml(zzanyVar.zzd));
            }
            if (i == 172) {
                return new zzang(new zzamg(zzanyVar.zzb, zzanyVar.zza()));
            }
            if (i == 257) {
                return new zzano(new zzanf("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzang(new zzamk(zzanyVar.zzb, zzanyVar.zza(), 5408));
                        }
                        switch (i) {
                            case 15:
                                return new zzang(new zzami(false, zzanyVar.zzb, zzanyVar.zza()));
                            case 16:
                                return new zzang(new zzamr(zzd(zzanyVar)));
                            case 17:
                                return new zzang(new zzamx(zzanyVar.zzb, zzanyVar.zza()));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzano(new zzanf("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzang(new zzamk(zzanyVar.zzb, zzanyVar.zza(), 4096));
                }
                return new zzang(new zzame(zzanyVar.zzb, zzanyVar.zza()));
            }
        }
        return new zzang(new zzamo(zzd(zzanyVar)));
    }

    public zzamj() {
        this(0);
    }

    public zzamj(int i) {
        this.zza = zzfzo.zzn();
    }
}
