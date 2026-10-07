package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaiv {
    /* JADX WARN: Code duplicated, block: B:130:0x025b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x0030, B:11:0x003b, B:14:0x004a, B:17:0x0056, B:20:0x0063, B:23:0x0072, B:26:0x007f, B:29:0x008d, B:31:0x0097, B:39:0x00b2, B:40:0x00c3, B:41:0x00d6, B:44:0x00e2, B:47:0x00ef, B:50:0x00fc, B:53:0x0109, B:56:0x0116, B:59:0x0123, B:62:0x0130, B:65:0x013d, B:68:0x014a, B:71:0x0157, B:75:0x0168, B:77:0x016e, B:79:0x0182, B:80:0x0189, B:82:0x0190, B:87:0x019b, B:92:0x01a7, B:130:0x025b, B:93:0x01bc, B:95:0x01c3, B:97:0x01cd, B:98:0x01e1, B:111:0x020d, B:114:0x021a, B:117:0x0226, B:120:0x0232, B:123:0x023e, B:126:0x024a, B:129:0x0254, B:131:0x026f, B:132:0x0276), top: B:137:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x025b, please report this as an issue */
    public static zzbc zza(zzed zzedVar) {
        String str;
        int iZzg = zzedVar.zzg() + zzedVar.zzd();
        int iZzg2 = zzedVar.zzg();
        int i = (iZzg2 >> 24) & 255;
        zzbc zzbcVarZze = null;
        try {
            if (i == 169 || i == 253) {
                int i10 = iZzg2 & 16777215;
                if (i10 == 6516084) {
                    int iZzg3 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1684108385) {
                        zzedVar.zzM(8);
                        String strZzA = zzedVar.zzA(iZzg3 - 16);
                        zzbcVarZze = new zzagf("und", strZzA, strZzA);
                    } else {
                        zzdt.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzev.zze(iZzg2)));
                    }
                } else if (i10 == 7233901 || i10 == 7631467) {
                    zzbcVarZze = zze(iZzg2, "TIT2", zzedVar);
                } else if (i10 == 6516589 || i10 == 7828084) {
                    zzbcVarZze = zze(iZzg2, "TCOM", zzedVar);
                } else if (i10 == 6578553) {
                    zzbcVarZze = zze(iZzg2, "TDRC", zzedVar);
                } else if (i10 == 4280916) {
                    zzbcVarZze = zze(iZzg2, "TPE1", zzedVar);
                } else if (i10 == 7630703) {
                    zzbcVarZze = zze(iZzg2, "TSSE", zzedVar);
                } else if (i10 == 6384738) {
                    zzbcVarZze = zze(iZzg2, "TALB", zzedVar);
                } else if (i10 == 7108978) {
                    zzbcVarZze = zze(iZzg2, "USLT", zzedVar);
                } else if (i10 == 6776174) {
                    zzbcVarZze = zze(iZzg2, "TCON", zzedVar);
                } else if (i10 == 6779504) {
                    zzbcVarZze = zze(iZzg2, "TIT1", zzedVar);
                } else {
                    zzdt.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzev.zze(iZzg2));
                }
            } else if (iZzg2 == 1735291493) {
                String strZza = zzagm.zza(zzb(zzedVar) - 1);
                if (strZza != null) {
                    zzbcVarZze = new zzagu("TCON", null, zzfzo.zzo(strZza));
                } else {
                    zzdt.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzg2 == 1684632427) {
                zzbcVarZze = zzd(1684632427, "TPOS", zzedVar);
            } else if (iZzg2 == 1953655662) {
                zzbcVarZze = zzd(1953655662, "TRCK", zzedVar);
            } else if (iZzg2 == 1953329263) {
                zzbcVarZze = zzc(1953329263, "TBPM", zzedVar, true, false);
            } else if (iZzg2 == 1668311404) {
                zzbcVarZze = zzc(1668311404, "TCMP", zzedVar, true, true);
            } else if (iZzg2 == 1668249202) {
                int iZzg4 = zzedVar.zzg();
                if (zzedVar.zzg() == 1684108385) {
                    int iZzg5 = zzedVar.zzg();
                    int i11 = zzain.zza;
                    int i12 = iZzg5 & 16777215;
                    if (i12 == 13) {
                        str = "image/jpeg";
                    } else if (i12 == 14) {
                        str = "image/png";
                        i12 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzdt.zzf("MetadataUtil", "Unrecognized cover art flags: " + i12);
                    } else {
                        zzedVar.zzM(4);
                        int i13 = iZzg4 - 16;
                        byte[] bArr = new byte[i13];
                        zzedVar.zzH(bArr, 0, i13);
                        zzbcVarZze = new zzafx(str, null, 3, bArr);
                    }
                } else {
                    zzdt.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzg2 == 1631670868) {
                zzbcVarZze = zze(1631670868, "TPE2", zzedVar);
            } else if (iZzg2 == 1936682605) {
                zzbcVarZze = zze(1936682605, "TSOT", zzedVar);
            } else if (iZzg2 == 1936679276) {
                zzbcVarZze = zze(1936679276, "TSOA", zzedVar);
            } else if (iZzg2 == 1936679282) {
                zzbcVarZze = zze(1936679282, "TSOP", zzedVar);
            } else if (iZzg2 == 1936679265) {
                zzbcVarZze = zze(1936679265, "TSO2", zzedVar);
            } else if (iZzg2 == 1936679791) {
                zzbcVarZze = zze(1936679791, "TSOC", zzedVar);
            } else if (iZzg2 == 1920233063) {
                zzbcVarZze = zzc(1920233063, "ITUNESADVISORY", zzedVar, false, false);
            } else if (iZzg2 == 1885823344) {
                zzbcVarZze = zzc(1885823344, "ITUNESGAPLESS", zzedVar, false, true);
            } else if (iZzg2 == 1936683886) {
                zzbcVarZze = zze(1936683886, "TVSHOWSORT", zzedVar);
            } else if (iZzg2 == 1953919848) {
                zzbcVarZze = zze(1953919848, "TVSHOW", zzedVar);
            } else if (iZzg2 == 757935405) {
                int i14 = -1;
                int i15 = -1;
                String strZzA2 = null;
                String strZzA3 = null;
                while (zzedVar.zzd() < iZzg) {
                    int iZzd = zzedVar.zzd();
                    int iZzg6 = zzedVar.zzg();
                    int iZzg7 = zzedVar.zzg();
                    zzedVar.zzM(4);
                    if (iZzg7 == 1835360622) {
                        strZzA2 = zzedVar.zzA(iZzg6 - 12);
                    } else {
                        int i16 = iZzg6 - 12;
                        if (iZzg7 == 1851878757) {
                            strZzA3 = zzedVar.zzA(i16);
                        } else {
                            if (iZzg7 == 1684108385) {
                                i15 = iZzg6;
                            }
                            if (iZzg7 == 1684108385) {
                                i14 = iZzd;
                            }
                            zzedVar.zzM(i16);
                        }
                    }
                }
                if (strZzA2 != null && strZzA3 != null && i14 != -1) {
                    zzedVar.zzL(i14);
                    zzedVar.zzM(16);
                    zzbcVarZze = new zzago(strZzA2, strZzA3, zzedVar.zzA(i15 - 16));
                }
            } else {
                zzdt.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzev.zze(iZzg2));
            }
            zzedVar.zzL(iZzg);
            return zzbcVarZze;
        } catch (Throwable th) {
            zzedVar.zzL(iZzg);
            throw th;
        }
    }

    private static int zzb(zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            int i = iZzg - 16;
            if (i == 1) {
                return zzedVar.zzm();
            }
            if (i == 2) {
                return zzedVar.zzq();
            }
            if (i == 3) {
                return zzedVar.zzo();
            }
            if (i == 4 && (zzedVar.zzf() & 128) == 0) {
                return zzedVar.zzp();
            }
        }
        zzdt.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagl zzc(int i, String str, zzed zzedVar, boolean z4, boolean z10) {
        int iZzb = zzb(zzedVar);
        if (z10) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z4 ? new zzagu(str, null, zzfzo.zzo(Integer.toString(iZzb))) : new zzagf("und", str, Integer.toString(iZzb));
        }
        zzdt.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzev.zze(i)));
        return null;
    }

    private static zzagu zzd(int i, String str, zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385 && iZzg >= 22) {
            zzedVar.zzM(10);
            int iZzq = zzedVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iZzq);
                String string = sb2.toString();
                int iZzq2 = zzedVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzagu(str, null, zzfzo.zzo(string));
            }
        }
        zzdt.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzev.zze(i)));
        return null;
    }

    private static zzagu zze(int i, String str, zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            return new zzagu(str, null, zzfzo.zzo(zzedVar.zzA(iZzg - 16)));
        }
        zzdt.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzev.zze(i)));
        return null;
    }
}
