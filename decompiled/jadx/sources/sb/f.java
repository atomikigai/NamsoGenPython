package sb;

import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import jc.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i) {
        super(0);
        this.f8474a = i;
        this.f8475b = hVar;
    }

    @Override // ic.a
    public final Object a() {
        switch (this.f8474a) {
            case 0:
                return this.f8475b.findViewById(R.id.cbn_item_internal_container);
            case 1:
                return (TextView) this.f8475b.findViewById(R.id.cbn_item_notification_count);
            case 2:
                return (BadgeImageView) this.f8475b.findViewById(R.id.cnb_item_icon);
            default:
                return (TextView) this.f8475b.findViewById(R.id.cbn_item_title);
        }
    }
}
