package q0;

import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f7904a;

    public i(h hVar) {
        this.f7904a = hVar;
    }

    public final ContentInfo a() {
        ContentInfo contentInfoE = this.f7904a.e();
        Objects.requireNonNull(contentInfoE);
        return contentInfoE;
    }

    public final String toString() {
        return this.f7904a.toString();
    }
}
