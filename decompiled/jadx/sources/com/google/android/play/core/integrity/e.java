package com.google.android.play.core.integrity;

import android.net.Network;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class e extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f2669b;

    public /* synthetic */ e(String str, Long l2, Network network, d dVar) {
        this.f2668a = str;
        this.f2669b = l2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Network a() {
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f2669b;
    }

    public final boolean equals(Object obj) {
        Long l2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f2668a.equals(integrityTokenRequest.nonce()) && ((l2 = this.f2669b) != null ? l2.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2668a.hashCode() ^ 1000003;
        Long l2 = this.f2669b;
        return ((iHashCode * 1000003) ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f2668a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f2668a + ", cloudProjectNumber=" + this.f2669b + ", network=null}";
    }
}
