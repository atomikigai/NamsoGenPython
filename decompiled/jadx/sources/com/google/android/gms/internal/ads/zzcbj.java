package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import d6.p;
import da.v;
import e6.t;
import h6.k0;
import h6.r0;
import i6.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import wa.d;
import z9.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcbj extends zzcbl implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzccf zzd;
    private final zzccg zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzccd zzn;
    private final boolean zzo;
    private int zzp;
    private zzcbk zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcbj(Context context, zzccf zzccfVar, boolean z4, boolean z10, zzcce zzcceVar, zzccg zzccgVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzccfVar;
        this.zze = zzccgVar;
        this.zzo = z4;
        this.zzf = z10;
        zzccgVar.zza(this);
    }

    private final void zzD() {
        k0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            p pVar = p.C;
            d dVar = pVar.f2993t;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzo) {
                zzccd zzccdVar = new zzccd(getContext());
                this.zzn = zzccdVar;
                zzccdVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzn.start();
                SurfaceTexture surfaceTextureZzb = this.zzn.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.zzn.zze();
                    this.zzn = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            c cVar = pVar.f2994u;
            this.zzi.setSurface(new Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzF(1);
        } catch (IOException e) {
            e = e;
            h.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
            onError(this.zzi, 1, 0);
        } catch (IllegalArgumentException e4) {
            e = e4;
            h.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
            onError(this.zzi, 1, 0);
        } catch (IllegalStateException e10) {
            e = e10;
            h.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzE(boolean z4) {
        k0.k("AdMediaPlayerView release");
        zzccd zzccdVar = this.zzn;
        if (zzccdVar != null) {
            zzccdVar.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z4) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i;
    }

    private final void zzG(float f10) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            h.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean zzH() {
        int i;
        return (this.zzi == null || (i = this.zzg) == -1 || i == 0 || i == 1) ? false : true;
    }

    public static void zzl(zzcbj zzcbjVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue() || zzcbjVar.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcbjVar.zzs = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                zzcbjVar.zzd.zzd("onMetadataEvent", map);
            }
        } catch (RuntimeException e) {
            p.C.f2982g.zzw(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        k0.k("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        r0.f5068l.post(new zzcbc(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i10) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i10));
        h.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzh = -1;
        r0.f5068l.post(new zzcbd(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i10) {
        Map map = zzc;
        k0.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i10))));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int defaultSize = View.getDefaultSize(this.zzk, i);
        int defaultSize2 = View.getDefaultSize(this.zzl, i10);
        if (this.zzk > 0 && this.zzl > 0 && this.zzn == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i10);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i14 = (this.zzl * size) / this.zzk;
                    if (mode2 == Integer.MIN_VALUE || i14 <= size2) {
                        defaultSize2 = i14;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i13 = (this.zzk * size2) / this.zzl;
                        if (mode != Integer.MIN_VALUE && i13 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i11 = this.zzk;
                        i12 = this.zzl;
                        if (mode2 == Integer.MIN_VALUE || i12 <= size2) {
                            i13 = i11;
                            size2 = i12;
                        } else {
                            i13 = (size2 * i11) / i12;
                        }
                        if (mode == Integer.MIN_VALUE && i13 > size) {
                            defaultSize2 = (i12 * size) / i11;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i13;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i15 = this.zzk;
                int i16 = i15 * size2;
                int i17 = this.zzl;
                int i18 = size * i17;
                if (i16 < i18) {
                    defaultSize = i16 / i17;
                } else {
                    if (i16 > i18) {
                        defaultSize2 = i18 / i15;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i14 = (this.zzl * size) / this.zzk;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i14;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i13 = (this.zzk * size2) / this.zzl;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i11 = this.zzk;
                        i12 = this.zzl;
                        if (mode2 == Integer.MIN_VALUE) {
                            i13 = i11;
                            size2 = i12;
                        } else {
                            i13 = i11;
                            size2 = i12;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i12 * size) / i11;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i13;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzccd zzccdVar = this.zzn;
        if (zzccdVar != null) {
            zzccdVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        k0.k("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        r0.f5068l.post(new zzcbb(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i = this.zzp;
        if (i != 0) {
            zzq(i);
        }
        if (this.zzf && zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            k0.k("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            p.C.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (zzH() && this.zzi.getCurrentPosition() == currentPosition) {
                p.C.f2983j.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.zzi.pause();
            zzn();
        }
        h.f("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        k0.k("AdMediaPlayerView surface created");
        zzD();
        r0.f5068l.post(new zzcbe(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzccd zzccdVar = this.zzn;
        if (zzccdVar != null) {
            zzccdVar.zze();
        }
        r0.f5068l.post(new zzcbg(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        k0.k("AdMediaPlayerView surface changed");
        int i11 = this.zzh;
        boolean z4 = false;
        if (this.zzk == i && this.zzl == i10) {
            z4 = true;
        }
        if (this.zzi != null && i11 == 3 && z4) {
            int i12 = this.zzp;
            if (i12 != 0) {
                zzq(i12);
            }
            zzp();
        }
        zzccd zzccdVar = this.zzn;
        if (zzccdVar != null) {
            zzccdVar.zzc(i, i10);
        }
        r0.f5068l.post(new zzcbf(this, i, i10));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i10) {
        k0.k("AdMediaPlayerView size changed: " + i + " x " + i10);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        k0.k("AdMediaPlayerView window visibility changed to " + i);
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return v.u(zzcbj.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * ((long) this.zzm)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzh() {
        if (this.zzs != null) {
            return ((long) zzc()) * ((long) this.zzs.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    public final /* synthetic */ void zzm(int i) {
        zzcbk zzcbkVar = this.zzq;
        if (zzcbkVar != null) {
            zzcbkVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl, com.google.android.gms.internal.ads.zzcci
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzo() {
        k0.k("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            r0.f5068l.post(new zzcbi(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzp() {
        k0.k("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            r0.f5068l.post(new zzcbh(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzq(int i) {
        k0.k("AdMediaPlayerView seek " + i);
        if (!zzH()) {
            this.zzp = i;
        } else {
            this.zzi.seekTo(i);
            this.zzp = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzr(zzcbk zzcbkVar) {
        this.zzq = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzs(String str) {
        Uri uri = Uri.parse(str);
        zzbax zzbaxVarZza = zzbax.zza(uri);
        if (zzbaxVarZza == null || zzbaxVarZza.zza != null) {
            if (zzbaxVarZza != null) {
                uri = Uri.parse(zzbaxVarZza.zza);
            }
            this.zzj = uri;
            this.zzp = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzt() {
        k0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzu(float f10, float f11) {
        zzccd zzccdVar = this.zzn;
        if (zzccdVar != null) {
            zzccdVar.zzf(f10, f11);
        }
    }
}
