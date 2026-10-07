package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyr;
import com.google.android.gms.internal.ads.zzgyx;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzgyr<MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> extends zzgwx<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzgyr(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhas.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzgwx zzaD(zzgwy zzgwyVar) {
        zzbi((zzgyx) zzgwyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgwx zzaW(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
        zzbk(zzgxvVar, zzgyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* JADX INFO: renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgwx zzaZ(byte[] bArr, int i, int i10) throws zzgzm {
        zzbl(bArr, i, i10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* JADX INFO: renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgwx zzba(byte[] bArr, int i, int i10, zzgyh zzgyhVar) throws zzgzm {
        zzbm(bArr, i, i10, zzgyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzhah zzaW(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
        zzbk(zzgxvVar, zzgyhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzhah zzaZ(byte[] bArr, int i, int i10) throws zzgzm {
        zzbl(bArr, i, i10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    public /* bridge */ /* synthetic */ zzhah zzba(byte[] bArr, int i, int i10, zzgyh zzgyhVar) throws zzgzm {
        zzbm(bArr, i, i10, zzgyhVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzcf()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwx
    /* JADX INFO: renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcZ();
        buildertype.zza = (MessageType) zzbs();
        return buildertype;
    }

    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException {
        zzbu();
        try {
            zzhas.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgxw.zzq(zzgxvVar), zzgyhVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i10) throws zzgzm {
        int i11 = zzgyh.zzb;
        int i12 = zzhas.zza;
        zzbm(bArr, i, i10, zzgyh.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i10, zzgyh zzgyhVar) throws zzgzm {
        zzbu();
        try {
            zzhas.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i10, new zzgxd(zzgyhVar));
            return this;
        } catch (zzgzm e) {
            throw e;
        } catch (IOException e4) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e4);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType messagetype = (MessageType) zzbs();
        if (messagetype.zzbw()) {
            return messagetype;
        }
        throw zzgwx.zzbb(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    /* JADX INFO: renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcf()) {
            return this.zza;
        }
        this.zza.zzbW();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhah zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (this.zza.zzcf()) {
            return;
        }
        zzbv();
    }

    public void zzbv() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final boolean zzbw() {
        return zzgyx.zzce(this.zza, false);
    }
}
