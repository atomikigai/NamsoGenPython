package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaen implements zzaef {
    public final zzfzo zza;
    private final int zzb;

    private zzaen(int i, zzfzo zzfzoVar) {
        this.zzb = i;
        this.zza = zzfzoVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaen zzc(int i, zzed zzedVar) {
        String str;
        zzaef zzaeoVar;
        String str2;
        zzfzl zzfzlVar = new zzfzl();
        int iZze = zzedVar.zze();
        int i10 = -2;
        while (zzedVar.zzb() > 8) {
            int iZzi = zzedVar.zzi();
            int iZzd = zzedVar.zzd() + zzedVar.zzi();
            zzedVar.zzK(iZzd);
            if (iZzi != 1414744396) {
                zzaeo zzaeoVar2 = null;
                switch (iZzi) {
                    case 1718776947:
                        if (i10 != 2) {
                            if (i10 == 1) {
                                int iZzk = zzedVar.zzk();
                                if (iZzk == 1) {
                                    str = "audio/raw";
                                } else if (iZzk == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzk == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzk != 8192) {
                                    str = iZzk != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzk2 = zzedVar.zzk();
                                    int iZzi2 = zzedVar.zzi();
                                    zzedVar.zzM(6);
                                    int iZzn = zzen.zzn(zzedVar.zzk());
                                    int iZzk3 = zzedVar.zzb() > 0 ? zzedVar.zzk() : 0;
                                    byte[] bArr = new byte[iZzk3];
                                    zzedVar.zzH(bArr, 0, iZzk3);
                                    zzab zzabVar = new zzab();
                                    zzabVar.zzZ(str);
                                    zzabVar.zzz(iZzk2);
                                    zzabVar.zzaa(iZzi2);
                                    if ("audio/raw".equals(str) && iZzn != 0) {
                                        zzabVar.zzT(iZzn);
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iZzk3 > 0) {
                                        zzabVar.zzM(zzfzo.zzo(bArr));
                                    }
                                    zzaeoVar = new zzaeo(zzabVar.zzaf());
                                } else {
                                    q1.a.o(iZzk, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                zzdt.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.zzD(i10)));
                            }
                            break;
                        } else {
                            zzedVar.zzM(4);
                            int iZzi3 = zzedVar.zzi();
                            int iZzi4 = zzedVar.zzi();
                            zzedVar.zzM(4);
                            int iZzi5 = zzedVar.zzi();
                            switch (iZzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                q1.a.o(iZzi5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                zzab zzabVar2 = new zzab();
                                zzabVar2.zzae(iZzi3);
                                zzabVar2.zzJ(iZzi4);
                                zzabVar2.zzZ(str2);
                                zzaeoVar2 = new zzaeo(zzabVar2.zzaf());
                            }
                        }
                        zzaeoVar = zzaeoVar2;
                        break;
                    case 1751742049:
                        zzaeoVar = zzaek.zzb(zzedVar);
                        break;
                    case 1752331379:
                        zzaeoVar = zzael.zzb(zzedVar);
                        break;
                    case 1852994675:
                        zzaeoVar = zzaep.zzb(zzedVar);
                        break;
                    default:
                        zzaeoVar = zzaeoVar2;
                        break;
                }
            } else {
                zzaeoVar = zzc(zzedVar.zzi(), zzedVar);
            }
            if (zzaeoVar != null) {
                if (zzaeoVar.zza() == 1752331379) {
                    int i11 = ((zzael) zzaeoVar).zza;
                    if (i11 == 1935960438) {
                        i10 = 2;
                    } else if (i11 == 1935963489) {
                        i10 = 1;
                    } else if (i11 != 1937012852) {
                        zzdt.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i11))));
                        i10 = -1;
                    } else {
                        i10 = 3;
                    }
                }
                zzfzlVar.zzf(zzaeoVar);
            }
            zzedVar.zzL(iZzd);
            zzedVar.zzK(iZze);
        }
        return new zzaen(i, zzfzlVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return this.zzb;
    }

    public final zzaef zzb(Class cls) {
        zzfzo zzfzoVar = this.zza;
        int size = zzfzoVar.size();
        int i = 0;
        while (i < size) {
            zzaef zzaefVar = (zzaef) zzfzoVar.get(i);
            i++;
            if (zzaefVar.getClass() == cls) {
                return zzaefVar;
            }
        }
        return null;
    }
}
