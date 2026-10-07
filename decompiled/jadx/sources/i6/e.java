package i6;

import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5226b;

    public /* synthetic */ e(int i) {
        this.f5225a = i;
    }

    public ib.c a() {
        if (this.f5226b != null) {
            return new ib.c(this);
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    @Override // i6.f
    public void b(JsonWriter jsonWriter) throws IOException {
        Object obj = g.f5227b;
        jsonWriter.name("params").beginObject();
        String str = this.f5226b;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f5225a) {
            case 3:
                return "<" + this.f5226b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(String str, int i) {
        this.f5225a = i;
        this.f5226b = str;
    }
}
