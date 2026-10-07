package o3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f7532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7534d;
    public static final e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f7535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f7536g;
    public static final e h;
    public static final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f7537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f7538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f7539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f7540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f7541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f7542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f7543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f7544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f7545r;

    static {
        f7.l lVarA = e.a();
        lVarA.f3642a = 3;
        lVarA.f3644c = "Google Play In-app Billing API version is less than 3";
        lVarA.a();
        f7.l lVarA2 = e.a();
        lVarA2.f3642a = 3;
        lVarA2.f3644c = "Google Play In-app Billing API version is less than 9";
        f7531a = lVarA2.a();
        f7.l lVarA3 = e.a();
        lVarA3.f3642a = 3;
        lVarA3.f3644c = "Billing service unavailable on device.";
        f7532b = lVarA3.a();
        f7.l lVarA4 = e.a();
        lVarA4.f3642a = 2;
        lVarA4.f3644c = "Billing service unavailable on device.";
        f7533c = lVarA4.a();
        f7.l lVarA5 = e.a();
        lVarA5.f3642a = 5;
        lVarA5.f3644c = "Client is already in the process of connecting to billing service.";
        f7534d = lVarA5.a();
        f7.l lVarA6 = e.a();
        lVarA6.f3642a = 5;
        lVarA6.f3644c = "The list of SKUs can't be empty.";
        lVarA6.a();
        f7.l lVarA7 = e.a();
        lVarA7.f3642a = 5;
        lVarA7.f3644c = "SKU type can't be empty.";
        lVarA7.a();
        f7.l lVarA8 = e.a();
        lVarA8.f3642a = 5;
        lVarA8.f3644c = "Product type can't be empty.";
        e = lVarA8.a();
        f7.l lVarA9 = e.a();
        lVarA9.f3642a = -2;
        lVarA9.f3644c = "Client does not support extra params.";
        f7535f = lVarA9.a();
        f7.l lVarA10 = e.a();
        lVarA10.f3642a = 5;
        lVarA10.f3644c = "Invalid purchase token.";
        f7536g = lVarA10.a();
        f7.l lVarA11 = e.a();
        lVarA11.f3642a = 6;
        lVarA11.f3644c = "An internal error occurred.";
        h = lVarA11.a();
        f7.l lVarA12 = e.a();
        lVarA12.f3642a = 5;
        lVarA12.f3644c = "SKU can't be null.";
        lVarA12.a();
        f7.l lVarA13 = e.a();
        lVarA13.f3642a = 0;
        i = lVarA13.a();
        f7.l lVarA14 = e.a();
        lVarA14.f3642a = -1;
        lVarA14.f3644c = "Service connection is disconnected.";
        f7537j = lVarA14.a();
        f7.l lVarA15 = e.a();
        lVarA15.f3642a = 2;
        lVarA15.f3644c = "Timeout communicating with service.";
        f7538k = lVarA15.a();
        f7.l lVarA16 = e.a();
        lVarA16.f3642a = -2;
        lVarA16.f3644c = "Client does not support subscriptions.";
        f7539l = lVarA16.a();
        f7.l lVarA17 = e.a();
        lVarA17.f3642a = -2;
        lVarA17.f3644c = "Client does not support subscriptions update.";
        lVarA17.a();
        f7.l lVarA18 = e.a();
        lVarA18.f3642a = -2;
        lVarA18.f3644c = "Client does not support get purchase history.";
        lVarA18.a();
        f7.l lVarA19 = e.a();
        lVarA19.f3642a = -2;
        lVarA19.f3644c = "Client does not support price change confirmation.";
        lVarA19.a();
        f7.l lVarA20 = e.a();
        lVarA20.f3642a = -2;
        lVarA20.f3644c = "Play Store version installed does not support cross selling products.";
        lVarA20.a();
        f7.l lVarA21 = e.a();
        lVarA21.f3642a = -2;
        lVarA21.f3644c = "Client does not support multi-item purchases.";
        f7540m = lVarA21.a();
        f7.l lVarA22 = e.a();
        lVarA22.f3642a = -2;
        lVarA22.f3644c = "Client does not support offer_id_token.";
        f7541n = lVarA22.a();
        f7.l lVarA23 = e.a();
        lVarA23.f3642a = -2;
        lVarA23.f3644c = "Client does not support ProductDetails.";
        f7542o = lVarA23.a();
        f7.l lVarA24 = e.a();
        lVarA24.f3642a = -2;
        lVarA24.f3644c = "Client does not support in-app messages.";
        lVarA24.a();
        f7.l lVarA25 = e.a();
        lVarA25.f3642a = -2;
        lVarA25.f3644c = "Client does not support user choice billing.";
        lVarA25.a();
        f7.l lVarA26 = e.a();
        lVarA26.f3642a = -2;
        lVarA26.f3644c = "Play Store version installed does not support external offer.";
        lVarA26.a();
        f7.l lVarA27 = e.a();
        lVarA27.f3642a = -2;
        lVarA27.f3644c = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        lVarA27.a();
        f7.l lVarA28 = e.a();
        lVarA28.f3642a = -2;
        lVarA28.f3644c = "Play Store version installed does not support querying AutoPay plan purchase.";
        lVarA28.a();
        f7.l lVarA29 = e.a();
        lVarA29.f3642a = -2;
        lVarA29.f3644c = "Play Store version installed does not support including suspended subscriptions.";
        lVarA29.a();
        f7.l lVarA30 = e.a();
        lVarA30.f3642a = 5;
        lVarA30.f3644c = "Unknown feature";
        lVarA30.a();
        f7.l lVarA31 = e.a();
        lVarA31.f3642a = -2;
        lVarA31.f3644c = "Play Store version installed does not support get billing config.";
        lVarA31.a();
        f7.l lVarA32 = e.a();
        lVarA32.f3642a = -2;
        lVarA32.f3644c = "Query product details with serialized docid is not supported.";
        lVarA32.a();
        f7.l lVarA33 = e.a();
        lVarA33.f3642a = -2;
        lVarA33.f3644c = "Play Store version installed does not support launching external offer flow.";
        lVarA33.a();
        f7.l lVarA34 = e.a();
        lVarA34.f3642a = 4;
        lVarA34.f3644c = "Item is unavailable for purchase.";
        f7543p = lVarA34.a();
        f7.l lVarA35 = e.a();
        lVarA35.f3642a = -2;
        lVarA35.f3644c = "Query product details with developer specified account is not supported.";
        lVarA35.a();
        f7.l lVarA36 = e.a();
        lVarA36.f3642a = -2;
        lVarA36.f3644c = "Play Store version installed does not support alternative billing only.";
        lVarA36.a();
        f7.l lVarA37 = e.a();
        lVarA37.f3642a = 5;
        lVarA37.f3644c = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f7544q = lVarA37.a();
        f7.l lVarA38 = e.a();
        lVarA38.f3642a = 6;
        lVarA38.f3644c = "An error occurred while retrieving billing override.";
        f7545r = lVarA38.a();
        f7.l lVarA39 = e.a();
        lVarA39.f3642a = -2;
        lVarA39.f3644c = "Play Store version installed does not support the provided billing program.";
        lVarA39.a();
    }

    public static e a(int i10, String str) {
        f7.l lVarA = e.a();
        lVarA.f3642a = i10;
        lVarA.f3644c = str;
        return lVarA.a();
    }
}
