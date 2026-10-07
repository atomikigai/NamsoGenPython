package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacl implements zzacw {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzack zzb = new zzack(new zzacj() { // from class: com.google.android.gms.internal.ads.zzach
        @Override // com.google.android.gms.internal.ads.zzacj
        public final Constructor zza() throws IllegalAccessException, InvocationTargetException {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacr.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzack zzc = new zzack(new zzacj() { // from class: com.google.android.gms.internal.ads.zzaci
        @Override // com.google.android.gms.internal.ads.zzacj
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzacr.class).getConstructor(null);
        }
    });
    private zzfzo zzd;
    private final zzakg zze = new zzakb();

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzamd());
                break;
            case 1:
                list.add(new zzamf());
                break;
            case 2:
                list.add(new zzamh(0));
                break;
            case 3:
                list.add(new zzaee(0));
                break;
            case 4:
                zzacr zzacrVarZza = zzb.zza(0);
                if (zzacrVarZza == null) {
                    list.add(new zzaew(0));
                } else {
                    list.add(zzacrVarZza);
                }
                break;
            case 5:
                list.add(new zzaey());
                break;
            case 6:
                list.add(new zzahq(this.zze, 0));
                break;
            case 7:
                list.add(new zzahw(0));
                break;
            case 8:
                list.add(new zzait(this.zze, 0, null, null, zzfzo.zzn(), null));
                list.add(new zzaiy(this.zze, 0));
                break;
            case 9:
                list.add(new zzajo());
                break;
            case 10:
                list.add(new zzanm());
                break;
            case 11:
                if (this.zzd == null) {
                    this.zzd = zzfzo.zzn();
                }
                list.add(new zzanw(1, 0, this.zze, new zzek(0L), new zzamj(0, this.zzd), 112800));
                break;
            case 12:
                list.add(new zzaoh());
                break;
            case 14:
                list.add(new zzafe(0));
                break;
            case 15:
                zzacr zzacrVarZza2 = zzc.zza(new Object[0]);
                if (zzacrVarZza2 != null) {
                    list.add(zzacrVarZza2);
                }
                break;
            case 16:
                list.add(new zzaej(0, this.zze));
                break;
            case 17:
                list.add(new zzajz());
                break;
            case 18:
                list.add(new zzaom());
                break;
            case 19:
                list.add(new zzaer());
                break;
            case 20:
                list.add(new zzafd());
                break;
            case zzbbs.zzt.zzm /* 21 */:
                list.add(new zzaeq());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized zzacr[] zza(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        int i10;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            if (str != null) {
                String strZze = zzbg.zze(str);
                switch (strZze.hashCode()) {
                    case -2123537834:
                        if (strZze.equals("audio/eac3-joc")) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1662384011:
                        if (strZze.equals("video/mp2p")) {
                            i = 10;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1662384007:
                        if (strZze.equals("video/mp2t")) {
                            i = 11;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1662095187:
                        if (strZze.equals("video/webm")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1606874997:
                        if (strZze.equals("audio/amr-wb")) {
                            i = 3;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487656890:
                        if (strZze.equals("image/avif")) {
                            i = 21;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487464693:
                        if (strZze.equals("image/heic")) {
                            i = 20;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487464690:
                        if (strZze.equals("image/heif")) {
                            i = 20;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487394660:
                        if (strZze.equals("image/jpeg")) {
                            i = 14;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1487018032:
                        if (strZze.equals("image/webp")) {
                            i = 18;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1248337486:
                        if (strZze.equals("application/mp4")) {
                            i = 8;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1079884372:
                        if (strZze.equals("video/x-msvideo")) {
                            i = 16;
                        } else {
                            i = -1;
                        }
                        break;
                    case -1004728940:
                        if (strZze.equals("text/vtt")) {
                            i = 13;
                        } else {
                            i = -1;
                        }
                        break;
                    case -879272239:
                        if (strZze.equals("image/bmp")) {
                            i = 19;
                        } else {
                            i = -1;
                        }
                        break;
                    case -879258763:
                        if (strZze.equals("image/png")) {
                            i = 17;
                        } else {
                            i = -1;
                        }
                        break;
                    case -387023398:
                        if (strZze.equals("audio/x-matroska")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case -43467528:
                        if (strZze.equals("application/webm")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case 13915911:
                        if (strZze.equals("video/x-flv")) {
                            i = 5;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187078296:
                        if (strZze.equals("audio/ac3")) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187078297:
                        if (strZze.equals("audio/ac4")) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187078669:
                        if (strZze.equals("audio/amr")) {
                            i = 3;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187090232:
                        if (strZze.equals("audio/mp4")) {
                            i = 8;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187091926:
                        if (strZze.equals("audio/ogg")) {
                            i = 9;
                        } else {
                            i = -1;
                        }
                        break;
                    case 187099443:
                        if (strZze.equals("audio/wav")) {
                            i = 12;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1331848029:
                        if (strZze.equals("video/mp4")) {
                            i = 8;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1503095341:
                        if (strZze.equals("audio/3gpp")) {
                            i = 3;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504578661:
                        if (strZze.equals("audio/eac3")) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504619009:
                        if (strZze.equals("audio/flac")) {
                            i = 4;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504824762:
                        if (strZze.equals("audio/midi")) {
                            i = 15;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1504831518:
                        if (strZze.equals("audio/mpeg")) {
                            i = 7;
                        } else {
                            i = -1;
                        }
                        break;
                    case 1505118770:
                        if (strZze.equals("audio/webm")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    case 2039520277:
                        if (strZze.equals("video/x-matroska")) {
                            i = 6;
                        } else {
                            i = -1;
                        }
                        break;
                    default:
                        i = -1;
                        break;
                }
            } else {
                i = -1;
            }
            if (i != -1) {
                zzb(i, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i10 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i10 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i10 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i10 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i10 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i10 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i10 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i10 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i10 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i10 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i10 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i10 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i10 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i10 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i10 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i10 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i10 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i10 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i10 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i10 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i10 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i10 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i10 = 21;
            } else {
                i10 = -1;
            }
            if (i10 != -1 && i10 != i) {
                zzb(i10, arrayList);
            }
            int[] iArr = zza;
            for (int i11 = 0; i11 < 21; i11++) {
                int i12 = iArr[i11];
                if (i12 != i && i12 != i10) {
                    zzb(i12, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzacr[]) arrayList.toArray(new zzacr[arrayList.size()]);
    }
}
